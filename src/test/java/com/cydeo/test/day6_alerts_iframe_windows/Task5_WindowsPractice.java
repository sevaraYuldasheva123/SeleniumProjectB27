package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_WindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }
    @Test
    public void windowsTask(){

        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereBtn = driver.findElement(By.xpath("//a[@target='_blank']"));
        clickHereBtn.click();

        //6. Switch to new Window.
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);

            System.out.println("eachWindow = " + eachWindow);
            System.out.println(driver.getTitle());

        }
        //7. Assert: Title is “New Window”
        String actualNewTitle = driver.getTitle();
        String expectedNewTitle = "New Window";

        Assert.assertEquals(actualNewTitle, expectedNewTitle);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
