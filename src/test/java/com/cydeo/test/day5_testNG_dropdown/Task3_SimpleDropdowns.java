package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void simpleDropDown(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown"))); //select[@id='dropdown']

       String actualSimpleDropdown  = simpleDropdown.getFirstSelectedOption().getText();
       String expectedSimpleDropdown =  "Please select an option";
        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateSelectionDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateSelection = stateSelectionDropdown.getFirstSelectedOption().getText();
        String expectedStateSelection = "Select a State";

        Assert.assertEquals(actualStateSelection, expectedStateSelection);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
