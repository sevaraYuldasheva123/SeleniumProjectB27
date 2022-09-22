package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_getText_Css {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String actualText = resetPasswordBtn.getText();
        String expectedText = "Reset password";

        if (actualText.equals(expectedText)){
            System.out.println("Reset Password Button Verification PASSED");
        }else {
            System.out.println("Reset Password Button Verification FAILED");
        }
        driver.quit();



    }
}
