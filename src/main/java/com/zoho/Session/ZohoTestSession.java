package com.Zoho.Session;

import org.testng.Reporter;

import com.Zoho.Base.Pages.HsbcPage;
import com.Zoho.Pages.Normal.LaunchPage;
import com.Zoho.Web.HsbcDriver;
import com.Zoho.Web.Webconnector;

public class HsbcTestSession {
    Webconnector con;
    HsbcPage currentPage; //current page

    public HsbcTestSession() {
        con = new HsbcDriver();
    }

    public HsbcPage init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

            return new LaunchPage();
       

    }

    public Webconnector getcon() {
        return con;
    }

    public HsbcPage getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(HsbcPage currentPage)
    {
        this.currentPage=currentPage;
    }

}
