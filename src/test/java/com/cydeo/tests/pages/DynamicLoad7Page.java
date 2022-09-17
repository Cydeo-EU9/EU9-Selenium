package com.cydeo.tests.pages;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DynamicLoad7Page {

    //#1-Create constructor and instantiate driver and object of the class

    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImage;

}
