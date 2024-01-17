package com.zoho.Base.Pages;

import org.openqa.selenium.WebDriver;


import com.zoho.Web.Webconnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    ZohoPage submitUsername(String userID);
    Webconnector validator();
    ZohoPage navigate();


  
}
