package com.Zoho.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.Zoho.Base.Pages.ZohoPage;

public interface ZohoWebConnector {

     void logout();
     ZohoPage validateTitle(String pageName,String expectedTitle);
     ZohoPage validateText(By locator,String expectedText);
     void validateLogin();
     void openBrowser(String browser);
     boolean isElementPresent(By locator);
     void navigate(String url);
     void quit();
     WebDriver getcurrentDriver();
     ZohoPage validateElementPresence(By locator);
     boolean isStopExecution();
     void setStopExecuton(boolean stopExecution);
     SoftAssert getSoftAssert();
     void setSoftassert(SoftAssert softAssert);

}
