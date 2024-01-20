package com.Zoho.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Session.ZohoTestSession;



public abstract class ZohoValidationDriver implements Webconnector{

    WebDriverListener listener;
    WebDriver webdriver;
    WebDriver driver ;
    SoftAssert softAssert=new SoftAssert();
    boolean stopExecution;

    public ZohoPage validateTitle(String expectedTitle)
    {
        String actualTitle=driver.getTitle();
       if(!actualTitle.equals(expectedTitle))
       softAssert.fail("Text Not Matching! Got the Text as "+ actualTitle);
       if(isStopExecution())
       softAssert.assertAll();
        return getSession().getCurrentPage();
    }
  
    public ZohoTestSession getSession()
    {
        return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }
   
    public boolean isStopExecution()
    {
        return stopExecution;
    }

    public void setStopExecuton(boolean stopExecution)
    {
        this.stopExecution=stopExecution;
    }
    public void assertAll()
    {
        softAssert.assertAll();
    }

   

}
