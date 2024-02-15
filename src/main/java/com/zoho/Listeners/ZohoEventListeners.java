package com.Zoho.Listeners;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.Zoho.Session.ZohoTestSession;
import com.Zoho.Web.Webconnector;

public class ZohoEventListeners implements WebDriverListener {

   
    public void beforeFindElement(WebDriver driver, By locator) {

        if(getSession().isExecuteListener())
        {
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            try{
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            }catch(Exception e)
            {
               getdriver().fail("Element not found "+ locator);
               getdriver().assertAll();
            }
        }

              
   // getdriver().fail("Could not find the Element");


    }

    public Webconnector getdriver()
    {
        return getSession().getcon();
    } 

     public ZohoTestSession getSession()
    {
        return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

    public void log(String message)
    {
        getSession().log(message);
    }
    
    
}
