package com.zoho.Web;

import org.openqa.selenium.WebDriver;

import com.zoho.Base.Pages.ZohoPage;

public interface ZohoWebConnector  {

     void logout();
     ZohoPage validateTitle(String expectedTitle);
     void validateLogin();
     void openBrowser(String browser);
     void navigate(String url);
     void quit();
     WebDriver getcurrentDriver();
   
}
