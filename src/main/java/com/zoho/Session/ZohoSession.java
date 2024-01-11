package com.zoho.Session;

import org.testng.Reporter;

public class ZohoSession {

    public void init() {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null) {
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
        }

    }

}
