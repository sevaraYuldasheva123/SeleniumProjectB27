package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {

    //1. Create new test and make set ups
    @Test
    public void crm_login_test(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com");

        //3. Enter valid username --> hr2@cydeo.com
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password --> UserUser
        WebElement passwordButton = driver.findElement(By.xpath("//input[@type='password']"));
        passwordButton.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal

       /* String actualTitle = driver.getTitle();
        String expectedTitle = "Portal";
        Assert.assertEquals(actualTitle, expectedTitle);

        */
        BrowserUtils.verifyTitle(driver, "Portal");



    }

    @Test
    public void crm_login_test2(){

        driver.get("http://login1.nextbasecrm.com");
        CRM_Utilities.login_crm(driver);


    }
    @Test
    public void crm_login_test3(){
        driver.get("http://login1.nextbasecrm.com");

        CRM_Utilities.login_crm(driver, "hr2@cydeo.com", "UserUser");
    }
}
