package com.cydeo.test.day2_locators_getText_GetAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryAppLogin {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cydeoschool.com/login.html
        driver.get("http://library2.cydeo.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement userName = driver.findElement(By.id("inputEmail"));
        userName.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password ");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed

        /*
        WebElement text = driver.findElement(By.linkText("Sorry, Wrong Email or Password"));

        if (text.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

         */

        driver.quit();
    }
}
