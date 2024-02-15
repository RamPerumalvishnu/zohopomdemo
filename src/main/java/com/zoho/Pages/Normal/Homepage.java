package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoBasePage;
import com.Zoho.Base.Pages.ZohoPage;


public class Homepage extends ZohoBasePage {

  

 
    @FindBy(xpath=Constant.SIGN_IN_LINK)
    WebElement signinLink;

    public ZohoPage gotoEnterUserNamePage(){
        signinLink.click();
        log("Navigating to User Name Page");
        return new EnterUSernamepage();
        
    

    }
    
}
