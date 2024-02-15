package com.Zoho.Web;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Session.ZohoTestSession;
import com.Zoho.reports.ExtentManager;
import com.aventstack.extentreports.Status;

public abstract class ZohoValidationDriver implements Webconnector {

    WebDriverListener listener;
    WebDriver webdriver;
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    boolean setStopExecuton;

    public ZohoPage validateTitle(String pageName,String expectedTitle) {
        String actualTitle = driver.getTitle();
        log("Validating the Title of the "+pageName+" Page");
       // System.out.println(actualTitle);
        if (!(actualTitle.equals(expectedTitle))) {
           fail("Actual Title do not match with Expected Title of page");
          
        }
        
        return getSession().getCurrentPage();
    }

    public ZohoPage validateText(By locator,String expectedText) {
        String actualText = driver.findElement(locator).getText();

        if (!actualText.equals(expectedText)) {
            fail("Actual Text--"+ actualText+" Does not match with Expected text--"+expectedText);
        }

        return getSession().getCurrentPage();
    }

    public ZohoTestSession getSession() {
        return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

    public boolean isStopExecution() {
        return setStopExecuton;
    }

    public void setStopExecuton(boolean setStopExecuton) {
        this.setStopExecuton = setStopExecuton;
    }

    public void assertAll() {
        softAssert.assertAll();
    }

    public SoftAssert getSoftAssert() {
        return softAssert;
    }

    public void setSoftassert(SoftAssert softAssert) {

        this.softAssert = softAssert;
    }

   public ZohoPage validateElementPresence(By locator)
   {
    if(!isElementPresent(locator))
    fail("Element-- "+ locator +" ---Not Found");

    
    return getSession().getCurrentPage();
   }

    public boolean isElementPresent(By locator)
    {
        getSession().setExecuteListener(false);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }catch(Exception e)
        {
            return false;
        }
        getSession().setExecuteListener(true);
    
        return true;
        
    }

    public void log(String message)
    {
        getSession().log(message);
    }

    public void failinReport(String message)
    {
        getSession().failinReport(message);
    }


    public void fail(String message)
    {
        //fail in ExtentReports
        
        //fail in testNg
       
      
        failinReport( message);
        softAssert.fail(message);
        //log("Title do not match");
        
       if(isStopExecution())       
        assertAll();
         //Decide whether the execution has to be stopped
    }

    

    

}
