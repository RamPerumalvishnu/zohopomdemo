package com.zoho.Web;

public interface ZohoWebConnector extends WebConnector {

     void logout();
     void validateTitle();
     void validateLogin();
     
     void openBrowser(String browser);
     void navigate(String url);
     void quit();
}
