package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_DropdownPractices {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void test1(){
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        selectState.selectByVisibleText("Illinois");

        //4. Select Virginia
        selectState.selectByValue("VA");

        //5. Select California
        selectState.selectByIndex(5);

        //6. Verify final selected option is California.

        String actualLastSelectedOption = selectState.getFirstSelectedOption().getText();
        String expectedLastSelectedOption = "California";
        Assert.assertTrue(actualLastSelectedOption.equals(expectedLastSelectedOption));

        //Use all Select options. (visible text, value, index)

        //finding index from options
        int index = 0;
        for (WebElement eachState : selectState.getOptions()){
            index++;
            if (eachState.getText().equals("California")){
                System.out.println(index);
            }

        }





    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
