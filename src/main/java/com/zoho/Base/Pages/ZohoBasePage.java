package com.zoho.Base.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.zoho.Session.ZohoTestSession;
import com.zoho.Web.Webconnector;

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
    public ZohoPage submitUsername(String userID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submitUsername'");
    }

    @Override
    public Webconnector validator() {
      return getSession().getcon();
    }

    public ZohoTestSession getSession()
    {
        return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
    }

       @Override
    public ZohoPage navigate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'navigate'");
    }

    @Override
    public ZohoPage gotoEnterUserNamePage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gotoEnterUserNamePage'");
    }
   
    public WebDriver getcurrentDriver()
    {
        return getSession().getcon().getcurrentDriver();
    }
   
    public Webconnector getdriver()
    {
        return getSession().getcon();
    }

    @Override
    public ZohoPage gotoEnterpasswordPage() {
        // TODO Auto-generated method stub
       return null;
    }

    
    

   
   

   
}
