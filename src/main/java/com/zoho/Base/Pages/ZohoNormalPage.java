package com.zoho.Base.Pages;

import com.zoho.Web.WebConnector;

public interface ZohoNormalPage {

    // Zoho Normal Page is to hold the basic browser operations
    ZohoPage openBrowser(String browser);
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    WebConnector validator();
    void quit();
    void getTotalWindows();

}
