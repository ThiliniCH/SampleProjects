package wow;

import org.openqa.selenium.By;
import utils.TestApp;

public class WowCheckOutPage {

    public void continueAsGuestPageNav(){
        TestApp.getInstance().getDriver().findElement(By.xpath("//*[contains(@class,'aBtnNext')]")).click();
    }

}
