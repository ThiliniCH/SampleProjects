package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class WowCheckoutAsAGuestForm {

    PropertyFileReader prop = new PropertyFileReader();
    WebElement FirstName = TestApp.getInstance().getDriver().findElement(By.id("firstName"));
    WebElement LastName = TestApp.getInstance().getDriver().findElement(By.id("lastName"));
    WebElement Email = TestApp.getInstance().getDriver().findElement(By.id("email"));
    WebElement Mobile = TestApp.getInstance().getDriver().findElement(By.id("mobile"));
    WebElement Agreement = TestApp.getInstance().getDriver().findElement(By.id("agreement"));
    WebElement Submit = TestApp.getInstance().getDriver().findElement(By.name("shoppingcart_checkout"));

    public void checkoutAsGuestForm(){

        FirstName.sendKeys(prop.getProperty("guestform","FirstName"));
        LastName.sendKeys(prop.getProperty("guestform","LastName"));
        Email.sendKeys(prop.getProperty("guestform","Email"));
        Mobile.sendKeys(prop.getProperty("guestform","Mobile"));
        Agreement.click();
        Submit.click();

    }

}
