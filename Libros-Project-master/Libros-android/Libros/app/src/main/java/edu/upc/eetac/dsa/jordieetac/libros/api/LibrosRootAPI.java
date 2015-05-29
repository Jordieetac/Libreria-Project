package edu.upc.eetac.dsa.jordieetac.libros.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jordii on 27/05/2015.
 */
public class LibrosRootAPI {
    private Map<String, Link> links;

    public LibrosRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }
}