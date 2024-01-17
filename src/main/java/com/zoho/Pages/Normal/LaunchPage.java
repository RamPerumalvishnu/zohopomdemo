package com.zoho.Pages.Normal;

import org.openqa.selenium.support.PageFactory;

import com.zoho.Base.Pages.ZohoBasePage;
import com.zoho.Base.Pages.ZohoPage;

public class LaunchPage extends ZohoBasePage {


   public LaunchPage()
   {
    PageFactory.initElements(getcurrentDriver(), this);
   }

    public ZohoPage openBrowser(String browser) {
        //ZohoTestSession session = getSession();
        getdriver().openBrowser("Chrome");
        return this;
    }   

    public ZohoPage gotoHomepage(){
          //  ZohoTestSession session = getSession();
          getdriver().navigate("https://www.zoho.com");

          return new Homepage();
       

    }

  


}
