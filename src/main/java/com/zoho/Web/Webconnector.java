package com.Zoho.Web;

import org.openqa.selenium.WebDriver;

import com.Zoho.Base.Pages.ZohoNormalPage;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Session.ZohoTestSession;

public interface Webconnector extends ZohoWebConnector {

    void logout();
    ZohoPage validateTitle(String expectedTitle);
    void validateLogin();
    void openBrowser(String browser);
    void navigate(String url);
    void quit();
    WebDriver getcurrentDriver();
    ZohoTestSession getSession();
   
   
     
    

}
