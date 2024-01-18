package com.zoho.Base.Pages;

import org.openqa.selenium.WebDriver;

import com.zoho.Session.ZohoTestSession;
import com.zoho.Web.Webconnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    Webconnector validator();
    ZohoPage navigate();
    ZohoTestSession getSession();
    ZohoPage submitUserName();


  
}
