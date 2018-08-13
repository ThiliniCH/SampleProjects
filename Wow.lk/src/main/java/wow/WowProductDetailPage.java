package wow;

import org.openqa.selenium.By;
import utils.TestApp;

public class WowProductDetailPage {

    public void checkoutPageNav(){
        TestApp.getInstance().getDriver().findElement(By.className("buy-now")).click();
    }

}
