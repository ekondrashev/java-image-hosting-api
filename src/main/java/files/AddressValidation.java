package files;

import log.Logs;
import objects.UrlValidator;
import setup.Setup;

import java.net.URL;
import java.util.logging.Logger;

public class AddressValidation implements urlValidationInterface {

    public UrlValidator Validation(URL url) {

        Setup setup = new Setup();

        Logger log = Logger.getLogger(Logs.class.getName());
        log.info("Add new url in progress for validation: " + url);

        UrlValidator urlValidator = new UrlValidator();

        char[] ex = url.toString().toCharArray();

        String extension = "";
        String formatName = "";

        for (int i = ex.length - 1; i > 0; i--) {
            extension = ex[i] + extension;
            if (ex[i] == '.') {
                break;
            }
            formatName = ex[i] + formatName;
        }

        for (int i = 0; i < setup.getExtensionList().size(); i++) {
            if(extension.equals(setup.getExtensionList().get(i))){
                urlValidator.setExtension(extension);
                urlValidator.setFormatName(formatName);
                urlValidator.setUrl(url);

                return urlValidator;
            }

        }

        return urlValidator;

    }
}
