package wow.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PropertyFileReader;
import utils.TestApp;
import wow.WowHomePage;
import wow.WowRegistrationForm;
import wow.WowRegistrationPage;

public class WowRegistrationSuccessScenario {
    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config", "url");

    @BeforeClass
    public void setUp (){

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL(url);

    }

    @Test(priority = 1)
    public void pageNav() throws InterruptedException {

        Thread.sleep(4000);

        WowHomePage wowHomePage = new WowHomePage();
        wowHomePage.loginNav();

        Thread.sleep(4000);

        WowRegistrationPage wowRegistrationPage = new WowRegistrationPage();
        wowRegistrationPage.registrationFormNav();

    }

    @Test(priority = 2)
    public void registrationForm() throws InterruptedException {
        WowRegistrationForm wowRegistrationForm = new WowRegistrationForm();
        wowRegistrationForm.registrationForm();

     //   Assert.assertTrue(TestApp.getInstance().getDriver().getPageSource().contains("status_mobile_verification"));
        Thread.sleep(4000);
//from class name
        String profileName = TestApp.getInstance().getDriver().findElement(By.className("wow_userinfo_welcome")).getText();
        Assert.assertEquals(profileName, "Hi,   Lahiru  ", "sucess registration");



    }

    @AfterClass
    public void tearDown(){
        TestApp.getInstance().closeBrowser();
    }

}
