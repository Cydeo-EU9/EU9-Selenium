package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;

public class T1_locators_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        //To auto generate local variable
        //Mac: option + enter
        //Windows: alt + enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else{
            System.out.println("Error message verification FAILED!!!");
        }

    }

}
