package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.tests.pages.*;
import com.cydeo.tests.utilities.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;

public class T1_DoubleClick {

    @Test
    public void t1_double_click_test(){
        //1. Goto
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double-click on the text “Double-click me to change my text color.”
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

        //4. Assert:Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\") = "
                + doubleClickPage.textToDoubleClick.getAttribute("style"));

        String actualStyleAttributeValue = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedInStyleAttribute = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInStyleAttribute));

    }

}
