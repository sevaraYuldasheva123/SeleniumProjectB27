package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    //1. Create a new method for login
    //2. Create a method to make Task3 logic re-usable
    //3. When method is called, it should simply login

    //This method should have at least 2 overloaded versions.
    //Method #1 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver driver
    public static void login_crm(WebDriver driver){

        //3. Enter valid username --> hr2@cydeo.com
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password --> UserUser
        WebElement passwordButton = driver.findElement(By.xpath("//input[@type='password']"));
        passwordButton.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }


    //Method #2 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String username
    //• Arg3: String password

    public static void login_crm(WebDriver driver, String username, String password){

        //3. Enter valid username --> hr2@cydeo.com
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys(username);

        //4. Enter valid password --> UserUser
        WebElement passwordButton = driver.findElement(By.xpath("//input[@type='password']"));
        passwordButton.sendKeys(password);

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }

}
