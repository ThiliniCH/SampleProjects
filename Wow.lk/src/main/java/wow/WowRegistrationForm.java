package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class WowRegistrationForm {

    PropertyFileReader prop = new PropertyFileReader();
    WebElement firstName = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_f_name"));
    WebElement lastName = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_l_name"));
    WebElement email = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_emailTxt"));
    WebElement mobile = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_mobileTxt"));
    WebElement password = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_password"));
    WebElement conformPassword = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_confirmPassword"));
    WebElement submit = TestApp.getInstance().getDriver().findElement(By.id("wow_reg_reg_btn"));

    public void registrationForm(){
        firstName.sendKeys(prop.getProperty("registrationform","FirstName"));
        lastName.sendKeys(prop.getProperty("registrationform","LastName"));
        email.sendKeys(prop.getProperty("registrationform","Email"));
        mobile.sendKeys(prop.getProperty("registrationform","Mobile"));
        password.sendKeys(prop.getProperty("registrationform","Password"));
        conformPassword.sendKeys(prop.getProperty("registrationform","ConfirmPassword"));
        submit.click();

    }
}
