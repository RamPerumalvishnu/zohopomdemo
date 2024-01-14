package com.zoho.Session;

import org.testng.Reporter;

import com.zoho.Base.Pages.ZohoPage;
import com.zoho.Pages.Normal.LaunchPage;
import com.zoho.Web.WebConnector;
import com.zoho.Web.ZohoDriver;

public class ZohoTestSession {
    WebConnector con;

    public ZohoTestSession() {
        con = new ZohoDriver();
    }

    public ZohoPage init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

            return new LaunchPage();
       

    }

    public WebConnector getcon() {
        return con;
    }

}
