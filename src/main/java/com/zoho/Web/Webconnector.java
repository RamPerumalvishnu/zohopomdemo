package com.Zoho.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.Zoho.Base.Pages.ZohoNormalPage;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Session.ZohoTestSession;

public interface Webconnector extends ZohoWebConnector {

    void logout();
    ZohoPage validateTitle(String pageName,String expectedTitle);
    ZohoPage validateText(By locator,String expectedText);
    void validateLogin();
    void openBrowser(String browser);
    void navigate(String url);
    void quit();
    WebDriver getcurrentDriver();
    ZohoTestSession getSession();
    boolean isStopExecution();
    void setStopExecuton(boolean stopExecution);
    ZohoPage validateElementPresence(By locator);
    void assertAll();
    SoftAssert getSoftAssert();
    void setSoftassert(SoftAssert softAssert);
    void log(String message);
    void fail(String message);
    void failinReport(String message);  
   
     
    

}
