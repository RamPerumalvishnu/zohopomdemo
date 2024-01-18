package com.zoho.Session;

import org.testng.Reporter;

import com.zoho.Base.Pages.ZohoPage;
import com.zoho.Pages.Normal.LaunchPage;
import com.zoho.Web.Webconnector;
import com.zoho.Web.ZohoDriver;

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

}
