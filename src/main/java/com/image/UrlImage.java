package com.image;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlImage implements Image{

    URL url;
    User user;

    public void setUser(User user) {
        this.user = user;
    }

    public UrlImage(URL url) {
        this.url = url;
    }

    public UrlImage(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    @Override
    public String getURL() {
        return url.toString();
    }

    @Override
    public User getUser() {
        return user;
    }
}
