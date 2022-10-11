package com.cydeo.test.day7_windows_webtables;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

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
    public void multiple_windows_test(){

        //3. Assert: Title is “Windows”
        //Assert.assertTrue(driver.getTitle().equals("Windows"));
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        //4. Click to: “Click Here” link
        WebElement clickHereBtn = driver.findElement(By.linkText("Click Here"));////a[.='Click Here']
        clickHereBtn.click();

        //5. Click to: “CYDEO” link
        WebElement cydeoBtn = driver.findElement(By.linkText("CYDEO")); ////a[.='CYDEO']
        cydeoBtn.click();

        //6. Switch to Cydeo page.
        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow: allWindows){
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        //7. Assert: Title is “Cydeo”
        //Assert.assertTrue(driver.getTitle().equals("Cydeo"));
        BrowserUtils.verifyTitle(driver, "Cydeo");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
