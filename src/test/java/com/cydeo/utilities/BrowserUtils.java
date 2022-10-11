package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {

    public static void sleep(int seconds){

        //utility method sleep, will add seconds to our program , Argument --> seconds
        try {
            Thread.sleep(seconds * 1000); // converting to miliseconds
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //utility method verify title, Arguments --> WebDriver driver , String expectedTitle
    public static void verifyTitle(WebDriver driver , String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
