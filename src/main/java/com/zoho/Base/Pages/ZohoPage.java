package com.Zoho.Base.Pages;

import org.openqa.selenium.WebDriver;

import com.Zoho.Session.ZohoTestSession;
import com.Zoho.Web.Webconnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    Webconnector validator();
    ZohoPage navigate();
    ZohoTestSession getSession();
    ZohoPage submitUserName();
    void quit();



  
}
