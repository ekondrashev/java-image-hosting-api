package com.image;

import java.util.Arrays;
import java.util.List;

public class Extension {

    static final private String PATH = "G:\\SaveFilesDB";

    static final private List<String> extensionList = Arrays.asList("png", "jpg", "jpeg");

    private String value;

    @Override
    public String toString() {
        return value;
    }

    public Extension(String url) {

        char[] ex = url.toCharArray();
        String extension = "";

        for (int i = ex.length - 1; i > 0; i--) {

            if (ex[i] == '.') {
                break;
            }
            extension = ex[i] + extension;
        }

        this.value = extension;
    }

    public static String path() {
        return PATH;
    }

    public boolean isExtensionOK() {

        for (int i = 0; i < extensionList.size(); i++) {
            if (value.equals(extensionList.get(i))) {
                return true;
            }

        }

        return false;
    }
}
