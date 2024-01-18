package com.Zoho.Base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Zoho.Session.ZohoTestSession;
import com.Zoho.Web.Webconnector;

public class ZohoBasePage implements ZohoPage {

   
   public ZohoBasePage()
   {
    PageFactory.initElements(getcurrentDriver(),this);
    getSession().setCurrentPage(this);
   }
   
    @Override
    public ZohoPage openBrowser(String browser) {
       
        return null;
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

   

    @Override
    public ZohoPage submitUserName() {
       return null;
    }

    @Override
    public void quit() {
        getcurrentDriver().quit();
    }

    
    
    

   
   

   
}
