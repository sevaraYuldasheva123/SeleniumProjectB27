package com.cydeo.test.day13_pom_explicitWait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {
    LibraryLoginPage libraryLoginPage;


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.app.url"));
         libraryLoginPage = new LibraryLoginPage();



    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com/
       // Driver.getDriver().get("https://library1.cydeo.com/");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMsg.isDisplayed());

    }

    @Test
    public void invalid_email_format_errpr_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com/
        //Driver.getDriver().get("https://library1.cydeo.com/");
        //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        //3- Enter invalid email format
        libraryLoginPage.inputUserName.sendKeys("aaasdjmail.com");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterInvalidEmailErrorMsg.isDisplayed());
    }

    @Test
    public void library_negative_login_test(){

        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUserName.sendKeys("wuhuwuhwu@gmail.com");
        libraryLoginPage.inputPassword.sendKeys("sgcfygcy");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailMsg.isDisplayed());

    }

    @Test
    public void library_positive_login_test(){

        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("library.app.username"));
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("library.app.password"));
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password


    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
