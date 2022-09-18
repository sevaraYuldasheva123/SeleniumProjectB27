package com.cydeo.test.day2_locators_getText_GetAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //  Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String actualHeader = headerText.getText();
        String expectedHeader = "Registration form";

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification PASSED");
        }else {
            System.out.println("Header Verification FAILED");
        }

        //4- Locate “First name” input box
        WebElement firstNameBox = driver.findElement(By.name("firstname"));



        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameBox.getAttribute("placeholder");

        if (expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("TEST COMPLETED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.quit();



    }
}
