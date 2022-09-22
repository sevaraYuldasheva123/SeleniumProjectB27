package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_getText {

    public static void main(String[] args) {

        /*
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Enter incorrect username: “incorrect”
        4- Enter incorrect password: “incorrect”
        5- Click to login button.
        6- Verify error message text is as expected:
        Expected: Incorrect login or password
         */
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginButton = driver.findElement(By.name("USER_LOGIN"));
        loginButton.sendKeys("wwssee");

        WebElement passwordButton = driver.findElement(By.name("USER_PASSWORD"));
        passwordButton.sendKeys("dhbhbfefe");

        WebElement login = driver.findElement(By.className("login-btn"));
        login.sendKeys(Keys.ENTER);

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();

        System.out.println(actualErrorMessage);

        if (expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Your test PASSED");
        }else {
            System.out.println("Your test FAILED");
        }

        driver.quit();

    }
}
