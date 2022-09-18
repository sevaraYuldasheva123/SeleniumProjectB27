package com.cydeo.test.day2_locators_getText_GetAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        //3- Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();
        //4- Verify title is:
        //  Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:"Practice"
        String expectedBackTitle = "Practice";

        if (expectedBackTitle.equals(driver.getTitle())){
            System.out.println("Second Verification PASSED, test is complete");
        }else {
            System.out.println("Second Verification FAILED, co through your test again");
        }
        driver.quit();

    }
}
