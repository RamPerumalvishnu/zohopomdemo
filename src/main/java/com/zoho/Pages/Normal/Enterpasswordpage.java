package com.zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.Base.Pages.Constant;
import com.zoho.Base.Pages.ZohoBasePage;
import com.zoho.Base.Pages.ZohoPage;

public class Enterpasswordpage extends ZohoBasePage{
     public Enterpasswordpage()
    {
     PageFactory.initElements(getcurrentDriver(), this);
    }
    @FindBy(id =Constant.PASSWORD)
    WebElement password;

    
    public ZohoPage gotoEnterpasswordPage(){
        password.sendKeys(Constant.userName);
        return null;
        
       
        
    

    }
}
