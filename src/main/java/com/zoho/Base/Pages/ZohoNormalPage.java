package com.zoho.Base.Pages;

public interface ZohoNormalPage {

    // Zoho Normal Page is to hold the basic browser operations
    ZohoPage openBrowser(String browser);
    ZohoPage gotoEnterUserNamePage();

    void quit();

    void getTotalWindows();

}
