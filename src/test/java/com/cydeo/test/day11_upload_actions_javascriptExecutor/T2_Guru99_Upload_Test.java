package com.cydeo.test.day11_upload_actions_javascriptExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void guru99_upload_test(){
        //1. Go to  “http://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        //2. Upload file into Choose File
        WebElement chooseFileBtn = Driver.getDriver().findElement(By.xpath("//input[@name='uploadfile_0']"));
        chooseFileBtn.sendKeys("/Users/sevarayuldasheva/Downloads/some-file.txt");

        //3. Click terms of servide check box
        WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        //4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        submitBtn.click();

        //5. Verify expected message appeared. Expected:
        //“1 file
        //has been successfully uploaded.”
        WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//h3[@id='res']"));
        String actualMsg = resultMsg.getText();
        String expectedMsg = "1 file\nhas been successfully uploaded.";

        Assert.assertEquals(actualMsg, expectedMsg);

        Driver.closeDriver();
    }
}
