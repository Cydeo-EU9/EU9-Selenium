package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //Locate all images under here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" texts under here:
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        //2. Hover over to first image
        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());

        //4. Hover over to second image
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();

        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

        //6. Hover over to third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();

        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());

        //BREAK UNTIL 3.13PM CST
    }

}
