package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;

public class T4_cssSelector_getText {

    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //                  tagName[attribute='value']

        //locating reset password button using class attribute and its value
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using VALUE attribute and its value
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Button text verification PASSED!");
        }else{
            System.out.println("Button text verification FAILED!");

        }
    }
}
