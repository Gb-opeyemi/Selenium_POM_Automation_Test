package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By signInBtn = By.xpath("//button[contains(.,'Sign In')]");

    public void setUserNameField(String username){
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);

    }

    public DashboardPage clickSignInBtn(){
        driver.findElement(signInBtn).click();
        return new DashboardPage(driver);
    }

    public String getLoginPageURL(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlToBe("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login"));
        return driver.getCurrentUrl();
    }
}

