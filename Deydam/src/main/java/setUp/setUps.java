package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {


    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeTest
    public void setup() throws InterruptedException {
        //Importation of Chrome Driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // Instantiate a WebDriver Object
        driver = new ChromeDriver();
        // Lauch URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //Thread.sleep(5000);
        //Maximize Window
        driver.manage().window().maximize();
        //Instantiate LoginPage after launching the browser
        loginPage = new LoginPage(driver);
        // Print Page Title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
