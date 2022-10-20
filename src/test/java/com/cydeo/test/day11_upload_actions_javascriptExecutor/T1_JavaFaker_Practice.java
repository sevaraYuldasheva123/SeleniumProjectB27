package com.cydeo.test.day11_upload_actions_javascriptExecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {

@Test
public void registrationForm(){

    //1. Open browser
    //2. Go to website: https://practice.cydeo.com/registration_form
    Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

    Faker faker = new Faker();
    //3. Enter first name
    WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='firstname']"));
    firstNameInput.sendKeys(faker.name().firstName());

    //4. Enter last name
    WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='lastname']"));
    lastNameInput.sendKeys(faker.name().lastName());

    //5. Enter username
    WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='username']"));
    userNameInput.sendKeys(faker.name().username().replace(".",""));

    //6. Enter email address
    WebElement emailInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='email']"));
    emailInput.sendKeys(faker.internet().emailAddress());

    //7. Enter password
    WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='password']"));
    passwordInput.sendKeys(faker.internet().password());

    //8. Enter phone number
    WebElement phoneNumInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='phone']"));
    phoneNumInput.sendKeys(faker.numerify("###-###-####"));

    //9. Select a gender from radio buttons
    List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));

    for (int i = 1; i <=3; i++){
        genders.get(faker.number().numberBetween(1, 3)).click();
    }

    //10. Enter date of birth
    WebElement dateOfBirthInput = Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='birthday']"));
    dateOfBirthInput.sendKeys("03/01/1992");

    //11. Select Department/Office
    Select select = new Select(Driver.getDriver().findElement
            (By.xpath("//select[@name='department']")));
    select.selectByIndex(faker.number().numberBetween(1,9));

    //12. Select Job Title
    Select select2 = new Select(Driver.getDriver().findElement
            (By.xpath("//select[@name='job_title']")));
    select2.selectByIndex(faker.number().numberBetween(1,8));

    //13. Select programming language from checkboxes
    WebElement javaSelection = Driver.getDriver().findElement(By.xpath("//label[@for='inlineCheckbox2']"));
    javaSelection.click();

    //14. Click to sign up button
    WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']"));
    signUpBtn.click();

    //15. Verify success message “You’ve successfully completed registration.” is
    //displayed.
    BrowserUtils.verifyTitle(Driver.getDriver(), "You’ve successfully completed registration.");
}
}
