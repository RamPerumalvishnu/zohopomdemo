package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoBasePage;
import com.Zoho.Base.Pages.ZohoPage;

public class Enterpasswordpage extends ZohoBasePage{
    
    @FindBy(id =Constant.PASSWORD)
    WebElement password;

    
    public ZohoPage gotoEnterpasswordPage(){
        password.sendKeys(Constant.userName);
        return null;
        
       
        
    

    }
}
