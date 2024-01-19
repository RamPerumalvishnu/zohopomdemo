package com.Zoho.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class ZohoEventListeners implements WebDriverListener {

   
    public void beforeFindElement(WebDriver driver, By locator) {

      System.out.println("Testing 123     ");


    }



    
    
}
