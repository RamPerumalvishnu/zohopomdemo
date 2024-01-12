package com.zoho.Web;



public interface WebConnector {

    void openBrowser(String browser);
    void navigate(String url);
    void quit();
     
    

}
