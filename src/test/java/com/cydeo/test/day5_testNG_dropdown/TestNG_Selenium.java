package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void googleTitle(){

        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expected = "Google";
        Assert.assertEquals( actualTitle, expected , "Assertion failed, Title is not matching" );

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
