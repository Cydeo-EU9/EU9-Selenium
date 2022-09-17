package com.cydeo.tests.pages;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//button[.='Remove']
    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    //@FindBy(css = "input[label='blah']")
    @FindBy(css = "input[type='checkbox']")
    public WebElement checkbox;

    //@FindBy(xpath = "//p[@id='message']")
    @FindBy(css = "p[id='message']")
    public WebElement message;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy(css = "input[type='text']")
    public WebElement inputBox;



}
