package com.Zoho.Base.Pages;

import org.openqa.selenium.WebDriver;

import com.Zoho.Session.ZohoTestSession;
import com.Zoho.Web.Webconnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    Webconnector validator(boolean stopExecution);
    ZohoPage navigate();
    ZohoTestSession getSession();
    ZohoPage submitUserName(String userName);
    ZohoPage submitPassword(String password);
    void quit();
    void log(String message);
  



  
}
