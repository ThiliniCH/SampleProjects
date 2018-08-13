package wow;

import org.openqa.selenium.By;
import utils.TestApp;

public class WowHomePage {

    public void CategoryPageNav (){
        TestApp.getInstance().getDriver().findElement(By.xpath("//span[text()='Fashion']")).click();
    }

    public void loginNav () throws InterruptedException {


        Thread.sleep(4000);
        TestApp.getInstance().getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/ul/li[2]/div/div/a/span[1]")).click();

        Thread.sleep(4000);

        TestApp.getInstance().getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/ul/li[2]/div/div/ul/li/a")).click();

    }

}

