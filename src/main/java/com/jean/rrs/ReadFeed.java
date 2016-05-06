package com.jean.rrs;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFeed {

    private URL url;

    public void buildUrl(String path){
        try {
            url = new URL(path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public InputStream getStream(){
        InputStream stream = null;
        try {
            stream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}
