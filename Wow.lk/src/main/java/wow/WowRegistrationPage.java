package wow;

import org.openqa.selenium.By;
import utils.TestApp;


public class WowRegistrationPage {
    public void registrationFormNav(){
        TestApp.getInstance().getDriver().findElement(By.id("wow_login_reg_now")).click();
    }
}
