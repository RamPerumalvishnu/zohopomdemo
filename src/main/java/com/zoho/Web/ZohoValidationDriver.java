package com.zoho.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.Reporter;

import com.zoho.Base.Pages.ZohoPage;
import com.zoho.Session.ZohoTestSession;



public abstract class ZohoValidationDriver implements Webconnector{

    WebDriverListener listener;
    WebDriver webdriver;
    WebDriver driver ;

    public ZohoPage validateTitle(String expectedTitle)
    {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        return getSession().getCurrentPage();
    }
  
    public ZohoTestSession getSession()
    {
        return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }
   


   

}
