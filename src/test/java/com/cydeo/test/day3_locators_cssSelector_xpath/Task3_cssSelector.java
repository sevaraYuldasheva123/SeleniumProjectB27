package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_cssSelector {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //1. css by type attribute
        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //2. css by value attribute
        //WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        //3. css by class attribute
        //WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //4. css by class attribute : syntax 2
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));
        String expectedLoginBtnText = "Log In";
        String actualLoginBtnText = loginButton.getAttribute("value");

        if (actualLoginBtnText.equals(expectedLoginBtnText)){
            System.out.println("Login text verification PASSED");
        }else {
            System.out.println("Login text verification FAILED");
        }

        driver.quit();






    }
}
