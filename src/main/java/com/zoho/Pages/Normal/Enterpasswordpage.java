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

    @FindBy(id = Constant.next_Button)
    WebElement nextButton;

    
    public ZohoPage submitPassword(String passwordid){

      //  System.out.println("In password entry page");
        password.sendKeys(passwordid);
        nextButton.click();
        return null;
       
        
    

    }
}
