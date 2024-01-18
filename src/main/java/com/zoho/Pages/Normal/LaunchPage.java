package com.Zoho.Pages.Normal;

import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.HsbcBasePage;
import com.Zoho.Base.Pages.HsbcPage;

public class LaunchPage extends HsbcBasePage {


   

    public HsbcPage openBrowser(String browser) {
        //HsbcTestSession session = getSession();
        getdriver().openBrowser("Chrome");
        return this;
    }   

    public HsbcPage gotoHomepage(){
          //  HsbcTestSession session = getSession();
          getdriver().navigate("https://www.Hsbc.com");

          return new Homepage();
       

    }

  


}
