package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_getAtribute {
    public static void main(String[] args) {

        //        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //
        //        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //        //3- Verify “remember me” label text is as expected:
        //        //Expected: Remember me on this computer
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMe = "Remember me on this computer";
        String actualRememberMe = rememberMe.getText();

        if(actualRememberMe.equals(expectedRememberMe)){
            System.out.println("Remember me label text verification PASSED");
        }else {
            System.out.println("Remember me label text verification FAILED");
        }
        //        //4- Verify “forgot password” link text is as expected:
        //        //Expected: Forgot your password?

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPassLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPassLinkText = forgotPasswordLink.getText();

        if (actualForgotPassLinkText.equals(expectedForgotPassLinkText)){
            System.out.println("Forgot password link text verification PASSED");
        }else {
            System.out.println("ActualForgotPasswordLinkText: "+ actualForgotPassLinkText);
            System.out.println("ExpectedForgotPasswordLinkText: "+expectedForgotPassLinkText);
            System.out.println("Forgot password link text verification FAILED");
        }

        //        //5- Verify “forgot password” href attribute’s value contains expected:
        //        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");

        if (actualInHref.contains(expectedInHref)){
            System.out.println("Href Attributes value verification PASSED");
        }else {
            System.out.println("Href Attributes value verification FAILED");
        }


        driver.quit();




    }
}
