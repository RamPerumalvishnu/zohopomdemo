package com.zoho.Base.Pages;

import com.zoho.Web.WebConnector;
import com.zoho.Web.Webconnector;

public interface ZohoNormalPage {

    // Zoho Normal Page is to hold the basic browser operations
    ZohoPage openBrowser(String browser);
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    Webconnector validator();
    void quit();
    void getTotalWindows();

}
