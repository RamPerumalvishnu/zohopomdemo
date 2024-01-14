package com.zoho.Base.Pages;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 
   
    // ZohoBased
    ZohoPage gotoHomepage();
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoRegisterpage();
    ZohoPage submitUsername(String userID);
    ZohoPage validator();
    ZohoPage navigate();

  
}
