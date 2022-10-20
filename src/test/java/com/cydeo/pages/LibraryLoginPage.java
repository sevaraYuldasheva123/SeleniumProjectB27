package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        //initializing our driver,              this keyword --> for
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //we are making webelements public so they can be accessible from anywhere in the project
    @FindBy(xpath = "//input[@type='email']") //same as (id="inputEmail")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']") //same as(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//div[.='This field is required.']/div") //same as(id="inputEmail-error")
    public WebElement fieldRequiredErrorMsg;

    @FindBy(xpath = "//button[.='Sign in']") ////same as button[@class='btn btn-lg btn-primary btn-block']
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailMsg;
}
