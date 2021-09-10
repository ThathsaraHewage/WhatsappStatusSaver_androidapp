package com.example.whatsapp;

import android.net.Uri;

public class modelClass {

    String path,filename;
    Uri uri;

    public modelClass(String path, String filename, Uri uri) {
        this.path = path;
        this.filename = filename;
        this.uri = uri;
    }

    public modelClass() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
