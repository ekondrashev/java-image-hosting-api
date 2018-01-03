import com.image.AllImages;
import com.image.UrlImage;
import com.image.User;
import org.junit.Test;

import java.net.MalformedURLException;


public class MyTest {

    @Test
    public void tets1() throws MalformedURLException {
        AllImages allImages = new AllImages();

        User user = new User("TestName", "MyPassword");
        UrlImage urlImage = new UrlImage("https://sinst.fwdcdn.com/img/newImg/touch-icon-iphone-retina.png");
        urlImage.setUser(user);
        allImages.addImage(urlImage);
    }
}
