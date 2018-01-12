package com.image;

public interface Images extends Iterable<Image>{

    void add(Image image);

    default Extension getExtention(String url) {

        return new Extension(url);
    }
}
