package com.zoho.Session;

import org.testng.Reporter;

import com.zoho.Base.Pages.ZohoPage;
import com.zoho.Pages.Normal.LaunchPage;

public class ZohoTestSession {

    public ZohoPage init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
        ZohoPage page = new LaunchPage();
        return page;

    }

}
