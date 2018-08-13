package wow;

import org.openqa.selenium.By;
import utils.TestApp;

public class WowContinueAsGuestPage {

    public void continueAsGuestFormNav(){
        TestApp.getInstance().getDriver().findElement(By.className("form-model")).click();
    }

}
