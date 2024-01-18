package com.Zoho.Web;

import org.openqa.selenium.WebDriver;

import com.Zoho.Base.Pages.HsbcPage;

public interface HsbcWebConnector  {

     void logout();
     HsbcPage validateTitle(String expectedTitle);
     void validateLogin();
     void openBrowser(String browser);
     void navigate(String url);
     void quit();
     WebDriver getcurrentDriver();
   
}
