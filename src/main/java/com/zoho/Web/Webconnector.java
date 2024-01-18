package com.Zoho.Web;

import org.openqa.selenium.WebDriver;

import com.Zoho.Base.Pages.HsbcNormalPage;
import com.Zoho.Base.Pages.HsbcPage;
import com.Zoho.Session.HsbcTestSession;

public interface Webconnector extends HsbcWebConnector {

    void logout();
    HsbcPage validateTitle(String expectedTitle);
    void validateLogin();
    void openBrowser(String browser);
    void navigate(String url);
    void quit();
    WebDriver getcurrentDriver();
    HsbcTestSession getSession();
   
   
     
    

}
