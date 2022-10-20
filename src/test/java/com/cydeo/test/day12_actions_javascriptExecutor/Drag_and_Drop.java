package com.cydeo.test.day12_actions_javascriptExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drag_and_Drop {
    @Test
    public void drag_and_drop_test(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesBtn = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesBtn.click();

        //2. Drag and drop the small circle to bigger circle.
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(2000).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualTextOnBigCircle = bigCircle.getText();
        String expectedTextOnBigCircle = "You did great!";

        Assert.assertEquals(actualTextOnBigCircle, expectedTextOnBigCircle);
        Driver.closeDriver();
    }
}
