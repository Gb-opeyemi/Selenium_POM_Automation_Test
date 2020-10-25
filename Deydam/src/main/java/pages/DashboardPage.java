package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    private By avatarBtn = By.className("topbar__avatar-name");
    private By logOutField = By.xpath("//p[text() = 'Log Out']");

    public void clickAvatarBtn(){
        driver.findElement(avatarBtn).click();
    }

    public LoginPage clickLogout(){
        driver.findElement(logOutField).click();
        return new LoginPage(driver);
    }
}
