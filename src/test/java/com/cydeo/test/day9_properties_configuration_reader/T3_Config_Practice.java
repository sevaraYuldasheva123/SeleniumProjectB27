package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_Config_Practice extends TestBase {

    //1- Open a chrome browser --> done in test base class

    @Test
    public void test1() {
        //2- Go to: https://google.com/
        //driver.get("https://google.com");
        driver.get(ConfigurationReader.getProperty("google.url"));

        //3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

        // 4- Verify title:
        //Expected: apple - Google Search
        BrowserUtils.verifyTitle(driver, "apple - Google Search");
    }
}
