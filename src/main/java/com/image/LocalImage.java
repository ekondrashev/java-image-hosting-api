package com.image;

import java.io.File;

public class LocalImage implements Image {

    String path;

    public LocalImage(String path) {
        this.path = path;
    }

    @Override
    public String URL() {
        return this.path;
    }


    @Override
    public User User() {
        String[] parts = path.split(File.separator);
        return new User(parts[parts.length - 2], null);
    }
}
