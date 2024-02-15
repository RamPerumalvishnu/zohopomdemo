package com.Zoho.Base.Pages;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.Zoho.Session.ZohoTestSession;

public class Constant  {

    
    public static final String  SIGN_IN_LINK="/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]";
    public static final By SIGN_IN_LINK_LOCATOR=By.xpath(SIGN_IN_LINK);
    public static final String USER_ID="login_id";
    public static final String userName="lramkumar89@yahoo.com";
    public static final String next_Button="nextbtn";
    public static final String PASSWORD="password";
    
    public static final By PASSWORD_LOCATOR=By.id("password");
    public static final String HOME_TITLE="Zoho | Cloud Software Suite for Businesses";
    public static final String REPORTS_PATH=System.getProperty("user.dir")+"//reports//";
    public static final String HOMEPAGE_TEXT="/html/body/main/div/div/div[2]/section[1]/div/div[1]/div[1]/span";
    public static final By HOMEPAGE_TEXT_LOCATOR=By.xpath(HOMEPAGE_TEXT);
    public static final String expectedHomepageText="powered by our life's work";
  
   
}
