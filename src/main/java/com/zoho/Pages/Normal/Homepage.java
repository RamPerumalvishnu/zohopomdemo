package com.zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.Base.Pages.Constant;
import com.zoho.Base.Pages.ZohoBasePage;
import com.zoho.Base.Pages.ZohoPage;


public class Homepage extends ZohoBasePage {

    public Homepage()
    {
     PageFactory.initElements(getcurrentDriver(), this);
    }

 
    @FindBy(xpath=Constant.SIGN_IN_LINK)
    WebElement signinLink;

    public ZohoPage gotoEnterUserNamePage(){
        signinLink.click();
        return new EnterUSernamepage();
    

    }
    
}
