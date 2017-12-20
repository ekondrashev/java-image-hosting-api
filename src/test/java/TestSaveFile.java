import files.SavePicture;
import org.junit.Test;
import java.io.IOException;
import java.net.URL;

public class TestSaveFile {

    @Test
    public void testSimpleSavePNG() throws IOException {

        SavePicture savePicture = new SavePicture();
        URL url = new URL("https://sinst.fwdcdn.com/img/newImg/touch-icon-iphone-retina.png");
        String name = "TestName";
        savePicture.write(url, name);

    }

    @Test
    public void testSimpleSaveJPEG() throws IOException {

        SavePicture savePicture = new SavePicture();
        URL url = new URL("https://www.tutorialspoint.com/videotutorials/images/tutorial_library_home.jpg");
        String name = "TestName";
        savePicture.write(url, name);

    }


}
