package com.Zoho.reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports reports;
	public static String screenshotFolderPath;
	public static String reportfolderpath;
	
	public static ExtentReports getReport(String basePath) {

		if(reports==null) {
			Date d = new Date();
			reportfolderpath=basePath+d.toString().replaceAll(":", "-");
			screenshotFolderPath=reportfolderpath+"//screenshots//";
			File file  = new File(screenshotFolderPath);
			file.mkdirs();
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportfolderpath);
			sparkReporter.config().setReportName("Production Regression Testing");
			sparkReporter.config().setDocumentTitle("Automation Reports");
			sparkReporter.config().setTheme(Theme.DARK);
			sparkReporter.config().setEncoding("utf-8");
			reports = new ExtentReports();
			reports.attachReporter(sparkReporter);
		}
		
		return reports;
		
	}
	
	
}
