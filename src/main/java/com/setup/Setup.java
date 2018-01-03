package com.setup;

import java.util.Arrays;
import java.util.List;

public class Setup {

    static public final String PATH = "G:\\SaveFilesDB";

    public List<String> extensionList = Arrays.asList(".png", ".jpg", ".jpeg");

    public List<String> getExtensionList() {
        return extensionList;
    }

    public void addExtensionList(String extension) {
        extensionList.add(extension);
    }

    public static String getPATH() {
        return PATH;
    }
}
