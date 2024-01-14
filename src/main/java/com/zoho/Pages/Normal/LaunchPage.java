package com.zoho.Pages.Normal;

import com.zoho.Base.Pages.ZohoBasePage;
import com.zoho.Base.Pages.ZohoPage;

public class LaunchPage extends ZohoBasePage {


    public ZohoPage openBrowser(String browser) {
        //ZohoTestSession session = getSession();
        getDriver().openBrowser("Chrome");
        return this;
    }   

    public ZohoPage gotoHomepage(){
     //   ZohoTestSession session = getSession();
     //   session.getcon().navigate("https://www.zoho.com");
        getDriver().navigate("https://www.zoho.com");
        return new Homepage();

    }

  


}
