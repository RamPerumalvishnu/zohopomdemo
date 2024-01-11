package com.zoho.Testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.zoho.Base.Pages.ZohoPage;
import com.zoho.Listeners.ZohoEventListeners;
import com.zoho.Pages.Normal.LaunchPage;
import com.zoho.Session.ZohoSession;

public class LoginTest {

	@Test
	public void login(){

		ZohoSession session = new ZohoSession();
		session.init();
		// System.out.println("printing"+ System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\lramk\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		// options.addArguments("--remote-allow-origins=*");
		WebDriver webdriver = new ChromeDriver(options);
		WebDriverListener listener = new ZohoEventListeners();
		WebDriver driver = new EventFiringDecorator(listener).decorate(webdriver);
		driver.get("https://www.zoho.com/");
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click();
		ZohoPage p = new LaunchPage();
		p.gotoHomepage();
			
		};

		
	
		

	}

}
