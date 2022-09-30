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

public class Task4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
    @Test
    public void iframeTask(){

        //p on web page stands for paragraph
        //driver.switchTo().frame(0); switching using index number
        //driver.switchTo().frame("mce_0_ifr"); // switching using id
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement textArea = driver.findElement(By.xpath("//p"));
        Assert.assertTrue( textArea.isDisplayed());

        //we have to switch back to main html page
        driver.switchTo().defaultContent(); // switch to main html --> parent iframe

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor” is displayed
        WebElement headerText = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(headerText.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
