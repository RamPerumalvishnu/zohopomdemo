package com.Zoho.Session;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Pages.Normal.LaunchPage;
import com.Zoho.Web.ZohoDriver;
import com.Zoho.reports.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.Zoho.Web.Webconnector;

public class ZohoTestSession {
    public Webconnector con;
    public ZohoPage currentPage; // current page
    public ExtentReports reports;
    public ExtentTest test;
    boolean executeListener;

    public ZohoTestSession() {
        con = new ZohoDriver();
    }

    public ZohoPage init(String testName) {

        if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
            Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);

        reports = ExtentManager.getReport(Constant.REPORTS_PATH);
        test = reports.createTest(testName);
        test.log(Status.INFO, "Starting the" + testName + "Test");
        // Zohopage
        return new LaunchPage();

    }

    public Webconnector getcon() {
        return con;
    }

    public ZohoPage getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(ZohoPage currentPage) {
        this.currentPage = currentPage;
    }

    public void end() {

        getcon().assertAll();
        // reports.flush();
    }

    public void log(String message) {
        test.log(Status.INFO, message);
    }

    public void failinReport(String message) {

        takeScreenShot();
        test.log(Status.FAIL, message);
    }

    public void generateReports() {
        reports.flush();
    }

    public boolean isExecuteListener()
    {
        return executeListener;
    }

    public void setExecuteListener(boolean executeListener)
    {
            this.executeListener=executeListener;
    }
    public void takeScreenShot() {
        // fileName of the screenshot
        Date d = new Date();
        String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
        
        System.out.println("Control inside take screenshot");
        // take screenshot
        File srcFile = ((TakesScreenshot)getcon().getcurrentDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // get the dynamic folder name
            FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath + screenshotFile));
            // put screenshot file in reports
            test.log(Status.INFO, "Screenshot-> "
                    + test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath + screenshotFile));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
