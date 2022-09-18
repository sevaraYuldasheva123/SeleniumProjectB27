package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws Exception{

        //1st step --> setting up webdriber manager
        WebDriverManager.chromedriver().setup();

        //2nd step --> opening an empty browser by creating instance driver
        WebDriver driver = new ChromeDriver();

        //3rd step --> go to "https://www.tesla.com" --. by using navigate to
        //driver.get("https://www.tesla.com");
        driver.navigate().to("https://www.tesla.com");

        Thread.sleep(5000); // to wait 3 seconds
        driver.navigate().back(); // go back to empty page

        Thread.sleep(5000); // to wait 3 seconds


        driver.navigate().to("https://www.google.com"); // to go to google page

        Thread.sleep(5000); // to wait 3 seconds


        driver.navigate().back(); // go back to empty page

        Thread.sleep(5000); // to wait 3 seconds


        driver.navigate().forward();
        Thread.sleep(5000); // to wait 3 seconds

        driver.navigate().to("https://www.tesla.com");
        driver.navigate().refresh();

        driver.close();



    }
}
