package testDashboard;

//import org.junit.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setUp.setUps;
import org.testng.annotations.Test;


public class DashboardTests extends setUps {

    @Test
    public void testDashboard(){
        loginPage.setUserNameField("Opyma");
        loginPage.setPasswordField("Tester@2020");
        DashboardPage dashboardPage = loginPage.clickSignInBtn();
        dashboardPage.clickAvatarBtn();
        LoginPage loginPage = dashboardPage.clickLogout();
    }

}
