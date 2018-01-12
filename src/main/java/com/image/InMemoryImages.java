package com.image;

import java.util.Iterator;
import java.util.List;

public class InMemoryImages implements Images {


    private List<Image> imagesList;

    @Override
    public void add(Image image) {
        this.imagesList.add(image);
    }

    public Iterator<Image> iterator() {
        return imagesList.iterator();
    }


}
