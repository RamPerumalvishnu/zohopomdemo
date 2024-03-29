package com.Zoho.Base.Pages;

import com.Zoho.Web.Webconnector;

public interface ZohoNormalPage {

    // Zoho Normal Page is to hold the basic browser operations
    ZohoPage openBrowser(String browser);
    ZohoPage gotoEnterUserNamePage();
    ZohoPage gotoEnterpasswordPage();
    Webconnector validator(boolean stopExecution);
    void quit();
    void getTotalWindows();
    ZohoPage submitPassword(String password);
    ZohoPage submitUserName(String userName);
    void log(String message);

  

}
