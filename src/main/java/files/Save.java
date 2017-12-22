package files;

import objects.UrlValidator;

import java.io.IOException;
import java.net.URL;

public interface Save {
    
     String pathToSave = null;

    public void write(UrlValidator urlValidator, String userName) throws IOException;

}
