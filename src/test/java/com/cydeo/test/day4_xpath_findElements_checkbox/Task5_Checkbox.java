package com.cydeo.test.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5_Checkbox {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        if (!checkbox1.isSelected()){
            System.out.println("Test PASSED, checkbox 1 is not selected");
        }else {
            System.out.println("Test FAILED, checkbox 1 is selected");
        }

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (checkbox2.isSelected()){
            System.out.println("Test PASSED, checkbox 2 is selected");
        }else {
            System.out.println("Test FAILED, checkbox 2 is NOT selected");
        }
        //4. Click checkbox #1 to select it.
        checkbox1.click();
        System.out.println(checkbox1.isSelected());

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        System.out.println(checkbox2.isSelected());

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
        if(checkbox1.isSelected() && !checkbox2.isSelected()){
            System.out.println("Both verification PASSED, checkbox1 is SELECTED and checkbox2 is NOT SELECTED");
        }else {
            System.out.println("Verification FAILED, one OR both of the options are not matching expected outcome");
        }

        driver.quit();

    }
}
