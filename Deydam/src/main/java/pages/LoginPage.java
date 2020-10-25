package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public DashboardPage clickSignInBtn(){
        driver.findElement(signInBtn).click();
        return new DashboardPage(driver);
    }
}

