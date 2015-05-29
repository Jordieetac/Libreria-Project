package edu.upc.eetac.dsa.jordieetac.libros;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import edu.upc.eetac.dsa.vmiranda.libros.api.AppException;
import edu.upc.eetac.dsa.vmiranda.libros.api.Libros;
import edu.upc.eetac.dsa.vmiranda.libros.api.LibrosAPI;

/**
 * Created by Jordii on 27/05/2015.
 *//
public class LibrosDetailActivity extends Activity{

    private class FetchStingTask extends AsyncTask<String, Void, Libros> {
        private ProgressDialog pd;

        @Override
        protected Libros doInBackground(String... params) {
            Libros libro = null;
            try {
                libro = LibrosAPI.getInstance(LibrosDetailActivity.this)
                        .getLibros(params[0]);
            } catch (AppException e) {
                Log.d(TAG, e.getMessage(), e);
            }
            return libro;
        }

        @Override
        protected void onPostExecute(Libros result) {
            loadSting(result);
            if (pd != null) {
                pd.dismiss();
            }
        }

        @Override
        protected void onPreExecute() {
            pd = new ProgressDialog(LibrosDetailActivity.this);
            pd.setTitle("Loading...");
            pd.setCancelable(false);
            pd.setIndeterminate(true);
            pd.show();
        }

    }

    private final static String TAG = LibrosDetailActivity.class.getName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libros_detail_layout);
        String urlSting = (String) getIntent().getExtras().get("url");
        (new FetchStingTask()).execute(urlSting);
    }
    private void loadSting(Libros libro) {
        TextView tvDetailTitulo = (TextView) findViewById(R.id.tvDetailTitulo);
        TextView tvDetailAutor = (TextView) findViewById(R.id.tvDetailAutor);
        TextView tvDetailLengua = (TextView) findViewById(R.id.tvDetailLengua);
        TextView tvDetailEditorial = (TextView) findViewById(R.id.tvDetailEditorial);

        tvDetailTitulo.setText(libro.getTitulo());
        tvDetailAutor.setText(libro.getAutor());
        tvDetailLengua.setText(libro.getLengua());
        tvDetailEditorial.setText(libro.getEditorial());
    }

}
