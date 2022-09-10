package com.cydeo.tests.base;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.concurrent.*;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
