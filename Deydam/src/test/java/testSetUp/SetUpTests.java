package testSetUp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setUp.setUps;

public class SetUpTests extends setUps {


    @Test (priority = 0)
    public void testGetPageURL(){
        //String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";
        String pageURL = loginPage.getLoginPageURL();
        if (pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")){
            System.out.println("The Webpage URL is " + pageURL);
        }
        else {
            System.out.println("Invalid URL. Actual Webpage URL is "+ pageURL);
        }

    }

}
