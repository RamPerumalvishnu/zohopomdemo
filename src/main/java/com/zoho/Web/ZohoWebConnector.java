package com.zoho.Web;

import org.openqa.selenium.WebDriver;

public interface ZohoWebConnector  {

     void logout();
     void validateTitle(String expectedTitle);
     void validateLogin();
     void openBrowser(String browser);
     void navigate(String url);
     void quit();
   
}
