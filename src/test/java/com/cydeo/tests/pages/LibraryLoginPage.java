package com.cydeo.tests.pages;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //#2- use @FindBy annotation to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;



}
