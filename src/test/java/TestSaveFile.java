import files.AddressValidation;
import files.SavePicture;
import objects.UrlValidator;
import org.junit.Test;
import java.io.IOException;
import java.net.URL;

public class TestSaveFile {

    @Test
    public void testSimpleSavePNG() throws IOException {

        SavePicture savePicture = new SavePicture();
        URL url = new URL("https://sinst.fwdcdn.com/img/newImg/touch-icon-iphone-retina.png");
        String name = "TestName";
        AddressValidation validation = new AddressValidation();

        UrlValidator urlValidator = validation.Validation(url);

        savePicture.write(urlValidator, name);
    }

    @Test
    public void testSimpleSaveJPEG() throws IOException {

        SavePicture savePicture = new SavePicture();
        URL url = new URL("https://www.tutorialspoint.com/videotutorials/images/tutorial_library_home.jpg");
        String name = "TestName2";

        AddressValidation validation = new AddressValidation();

        UrlValidator urlValidator = validation.Validation(url);

        savePicture.write(urlValidator, name);

    }

//    @Test
//    public void testCheckForFileWhole() throws IOException {
//
//        CheckForFileWhole checkForFileWhole = new CheckForFileWhole();
//
//        System.out.print(checkForFileWhole.testWhole("G:\\SaveFilesDB\\image TestName 1513853303985" + ".jpg", "G:\\SaveFilesDB\\image TestName 1513853303985" + ".jpg"));
//    }


}
