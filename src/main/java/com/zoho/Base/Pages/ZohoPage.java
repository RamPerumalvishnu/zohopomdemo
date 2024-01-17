package com.zoho.Base.Pages;

import org.openqa.selenium.WebDriver;

import com.zoho.Web.WebConnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    ZohoPage submitUsername(String userID);
    WebConnector validator();
    ZohoPage navigate();


  
}
