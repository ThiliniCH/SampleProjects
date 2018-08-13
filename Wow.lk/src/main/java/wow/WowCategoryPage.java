package wow;

import org.openqa.selenium.By;
import utils.TestApp;

public class WowCategoryPage {

    public void detailPageNav(){
        TestApp.getInstance().getDriver().findElement(By.xpath("//label[text()='CASIO G-shock']")).click();
        TestApp.getInstance().getDriver().findElement(By.id("skucsv58642")).click();
    }

}
