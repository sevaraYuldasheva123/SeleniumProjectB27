package com.cydeo.test.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_xpath_cssSelector {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink1 = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']"));

        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement forgotPassword4 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        //xpath using text
        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));
        //xpath using contains
        WebElement emailText2 = driver.findElement(By.xpath("//label[contains(@for, 'email')]"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[contains(@style, 'text')]"));

        //4. Verify all web elements are displayed.
        System.out.println(homeLink1.isDisplayed());
        System.out.println("homeLink2.isDisplayed() = " + homeLink2.isDisplayed());
        System.out.println("homeLink3.isDisplayed() = " + homeLink3.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("forgotPassword2.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("forgotPassword3.isDisplayed() = " + forgotPassword3.isDisplayed());
        System.out.println("forgotPassword4.isDisplayed() = " + forgotPassword4.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailText2.isDisplayed() = " + emailText2.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

        driver.quit();


    }
}
