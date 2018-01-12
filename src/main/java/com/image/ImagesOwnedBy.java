package com.image;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImagesOwnedBy implements Images {

    Images list;
    User user;

    public ImagesOwnedBy(Images list, User user) {
        this.list = list;
         this.user = user;
    }

    @Override
    public void add(Image image) {
        list.add(image);
    }

    @Override
    public Iterator<Image> iterator() {

        List<Image> result = new ArrayList<>();

        for (Image image : list) {
            if(image.User().equals(user))
            {
                result.add(image);
            }
        }

        return result.iterator();
    }
}
