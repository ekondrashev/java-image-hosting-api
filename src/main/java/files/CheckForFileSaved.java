package files;

import java.io.File;

public class CheckForFileSaved {

    boolean test(String filepath) {

       return new File(filepath).exists();
    }

}
