package com.cydeo.test.day8_webtable_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_remake extends TestBase {

    @Test
    public void order_name_verify_test(){
        driver.get("https://practice.cydeo.com/web-tables");
        WebElement bobMartinName = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        //Assert.assertTrue(bobMartinName.isDisplayed());
        String expectedName = "Bob Martin";
        String actualName = bobMartinName.getText();
        Assert.assertEquals(actualName, expectedName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement date =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(date.getText(), "12/31/2021");


    }
}
