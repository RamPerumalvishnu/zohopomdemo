package com.Zoho.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.Reporter;

import com.Zoho.Base.Pages.HsbcPage;
import com.Zoho.Session.HsbcTestSession;



public abstract class HsbcValidationDriver implements Webconnector{

    WebDriverListener listener;
    WebDriver webdriver;
    WebDriver driver ;

    public HsbcPage validateTitle(String expectedTitle)
    {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        return getSession().getCurrentPage();
    }
  
    public HsbcTestSession getSession()
    {
        return (HsbcTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }
   


   

}
