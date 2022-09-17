package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate "Accept Cookies" button and click
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        //Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);
    }


}
