package wow.test;

import org.testng.annotations.*;
import utils.PropertyFileReader;
import utils.TestApp;
import wow.*;


public class WowVerifyingSuccessPath {

    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config", "url");


    @BeforeClass
    public void setUp() {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL(url);

    }

    @Test(priority = 1)

    public void pageNav() throws InterruptedException {

        Thread.sleep(4000);

        WowHomePage wowHomePage = new WowHomePage();
        wowHomePage.CategoryPageNav();

        Thread.sleep(4000);

        WowCategoryPage wowCategoryPage = new WowCategoryPage();
        wowCategoryPage.detailPageNav();

        Thread.sleep(4000);

        WowProductDetailPage wowProductDetailPage = new WowProductDetailPage();
        wowProductDetailPage.checkoutPageNav();

        Thread.sleep(4000);

        WowCheckOutPage wowCheckOutPage = new WowCheckOutPage();
        wowCheckOutPage.continueAsGuestPageNav();

        Thread.sleep(4000);

        WowContinueAsGuestPage wowContinueAsGuestPage = new WowContinueAsGuestPage();
        wowContinueAsGuestPage.continueAsGuestFormNav();

        Thread.sleep(4000);

        //   TestApp.getInstance().getDriver().findElement(By.xpath("//span[text()='Fashion']")).click();
        //   TestApp.getInstance().getDriver().findElement(By.xpath("//label[text()='CASIO G-shock']")).click();
        //   TestApp.getInstance().getDriver().findElement(By.id("skucsv58642")).click();
        //   TestApp.getInstance().getDriver().findElement(By.className("buy-now")).click();
        //   TestApp.getInstance().getDriver().findElement(By.xpath("//*[contains(@class,'aBtnNext')]")).click();
        //   TestApp.getInstance().getDriver().findElement(By.className("form-model")).click();

    }

    @Test(priority = 2)
    public void testCheckoutAsGuestForm() {
        WowCheckoutAsAGuestForm wowCheckoutAsAGuestForm = new WowCheckoutAsAGuestForm();
        wowCheckoutAsAGuestForm.checkoutAsGuestForm();

    }

    @AfterClass
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }


}
