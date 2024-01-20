package com.Zoho.Session;

import org.testng.Reporter;

import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Pages.Normal.LaunchPage;
import com.Zoho.Web.ZohoDriver;
import com.Zoho.Web.Webconnector;

public class ZohoTestSession {
    Webconnector con;
    ZohoPage currentPage; //current page

    public ZohoTestSession() {
        con = new ZohoDriver();
    }

    public ZohoPage init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

            return new LaunchPage();
       

    }

    public Webconnector getcon() {
        return con;
    }

    public ZohoPage getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(ZohoPage currentPage)
    {
        this.currentPage=currentPage;
    }

    public void end()
    {
        getcon().assertAll();
    }

}
