package com.zoho.Base.Pages;

import org.testng.Reporter;

import com.zoho.Session.ZohoTestSession;
import com.zoho.Web.WebConnector;

public class ZohoBasePage implements ZohoPage {

    @Override
    public ZohoPage openBrowser(String browser) {
       
        return null;
    }

    @Override
    public void quit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quit'");
    }

    @Override
    public void getTotalWindows() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalWindows'");
    }

    @Override
    public void createDeal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDeal'");
    }

    @Override
    public void logout() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

    @Override
    public ZohoPage gotoHomepage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gotoHomepage'");
    }

    @Override
    public void gotoRegisterpage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gotoRegisterpage'");
    }

    @Override
    public void submitUsername(String userID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submitUsername'");
    }

    @Override
    public void validator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validator'");
    }

    public ZohoTestSession getSession()
    {
        return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

    public WebConnector getDriver()
    {
        return getSession().getcon();
    }


    @Override
    public ZohoPage navigate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'navigate'");
    }

    @Override
    public ZohoPage gotoEnterUserNamePage() {
        return null;
    }

   

   
}
