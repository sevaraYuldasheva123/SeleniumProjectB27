package com.cydeo.test.day12_actions_javascriptExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task_4_and_5_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");


        //3- Scroll down to “Powered by CYDEO”
        //4- Scroll using Actions class “moveTo(element)” method

        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();
        BrowserUtils.sleep(2);


//        1- Continue from where the Task 4 is left in the same test.
//        2- Scroll back up to “Home” link using PageUP button
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        //actions.moveToElement(homeLink).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();

    }
}
