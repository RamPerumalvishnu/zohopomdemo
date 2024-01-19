package com.Zoho.Pages.Normal;

import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.ZohoBasePage;
import com.Zoho.Base.Pages.ZohoPage;

public class LaunchPage extends ZohoBasePage {


   

    public ZohoPage openBrowser(String browser) {
        //ZohoTestSession session = getSession();
        getdriver().openBrowser("Chrome");
        return this;
    }   

    public ZohoPage gotoHomepage(){
          //  ZohoTestSession session = getSession();
          getdriver().navigate("https://www.Zoho.com");

          return new Homepage();
       

    }

  


}
