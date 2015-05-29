package edu.upc.eetac.dsa.jordieetac.libros.api;

/**
 * Created by Jordii on 27/05/2015.
 */
public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}
