package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1_RadioButton {

    public static void main(String[] args) {


        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyButton.isSelected()){
            System.out.println("Verification PASSED, Hockey button is clicked");
        }else {
            System.out.println("Verification FAILED, Hockey button is NOT clicked");
        }

        List<WebElement> sportRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSportRB : sportRadioButtons){
            eachSportRB.click();

            if (eachSportRB.isSelected()){
                System.out.println(eachSportRB.getAttribute("id")+ " Radio Button is selected");
            }else {
                System.out.println(eachSportRB.getAttribute("id") + " is not selected");
            }

        }
        driver.quit();

    }
}
