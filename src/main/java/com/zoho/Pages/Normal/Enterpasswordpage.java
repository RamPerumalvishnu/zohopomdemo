package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.HsbcBasePage;
import com.Zoho.Base.Pages.HsbcPage;

public class Enterpasswordpage extends HsbcBasePage{
    
    @FindBy(id =Constant.PASSWORD)
    WebElement password;

    
    public HsbcPage gotoEnterpasswordPage(){
        password.sendKeys(Constant.userName);
        return null;
        
       
        
    

    }
}
