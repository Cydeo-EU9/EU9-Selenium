package com.cydeo.tests.utilities;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }


    }

}
