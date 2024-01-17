package com.zoho.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;



public abstract class ZohoValidationDriver implements Webconnector{

    WebDriverListener listener;
    WebDriver webdriver;
    WebDriver driver ;
    public void validateTitle(String expectedTitle)
    {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
  
   


   

}
