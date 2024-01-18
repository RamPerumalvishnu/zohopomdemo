package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.HsbcBasePage;
import com.Zoho.Base.Pages.HsbcPage;


public class Homepage extends HsbcBasePage {

  

 
    @FindBy(xpath=Constant.SIGN_IN_LINK)
    WebElement signinLink;

    public HsbcPage gotoEnterUserNamePage(){
        signinLink.click();
        return new EnterUSernamepage();
    

    }
    
}
