package com.cydeo.test.day12_actions_javascriptExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JavascriptExecutor {

    @Test
    public void task7_javascriptExecutor_scroll_test(){
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        BrowserUtils.sleep(2);

        //3- Scroll down to “Cydeo” link
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));

        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        BrowserUtils.sleep(2);
        //4- Scroll up to “Home” link
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

        //5- Use below provided JS method only


        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them
        //as arguments into executeScript() method


    }
}
