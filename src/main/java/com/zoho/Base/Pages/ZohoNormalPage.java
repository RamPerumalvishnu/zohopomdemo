package com.zoho.Base.Pages;

public interface ZohoNormalPage {

    // Zoho Normal Page is to hold the basic browser operations
    ZohoPage openBrowser(String browser);

    void quit();

    void getTotalWindows();

}
