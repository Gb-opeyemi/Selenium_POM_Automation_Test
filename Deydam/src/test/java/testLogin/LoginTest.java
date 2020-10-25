package testLogin;

//import org.junit.Test;
import pages.DashboardPage;
import setUp.setUps;
import org.testng.annotations.Test;

public class LoginTest extends setUps {

    @Test
    public void testSuccessfulLogin(){
        loginPage.setUserNameField("Opyma");
        loginPage.setPasswordField("Tester@2020");
        DashboardPage dashboardPage = loginPage.clickSignInBtn();

    }
}
