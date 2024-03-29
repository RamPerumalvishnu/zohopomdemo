package com.Zoho.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Listeners.ZohoEventListeners;

public class ZohoDriver extends ZohoValidationDriver{
    

  

    @Override
    public void openBrowser(String browser) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\lramk\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		listener = new ZohoEventListeners();
        webdriver = new ChromeDriver(options);
		driver = new EventFiringDecorator(listener).decorate(webdriver);
    }

    @Override
    public void navigate(String url) {
        log("Navigating to "+url);
		driver.get(url);
    }

   

    @Override
    public void quit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quit'");
    }

    public WebDriver getcurrentDriver()
    {
        return driver;
    }

   

    @Override
    public void validateLogin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateLogin'");
    }

   


    @Override
    public void logout() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

   


    
   
   

    

    

     
  
    
    
    
    
}
