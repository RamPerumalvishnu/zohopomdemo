package com.zoho.Base.Pages;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {

 

    // ZohoBased
    void gotoHomepage();

    void gotoRegisterpage();

    void submitUsername(String userID);

    void validator();

  
}
