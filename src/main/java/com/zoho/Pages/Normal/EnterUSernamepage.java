
package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoBasePage;
import com.Zoho.Base.Pages.ZohoPage;

public class EnterUSernamepage extends ZohoBasePage {

   

    @FindBy(id = Constant.USER_ID)
    WebElement loginid;

    @FindBy(id = Constant.next_Button)
    WebElement nextButton;

    public ZohoPage submitUserName(String userName) {
        loginid.sendKeys(userName);
        nextButton.click();
      boolean presencepasswordField =validator(false).isElementPresent(Constant.PASSWORD_LOCATOR);
       System.out.println("Presence of element "+presencepasswordField);
      
      if(!presencepasswordField)
        {
           // System.out.println("ELEMENT not PRESENCE ");
            return this;
        }
       
        else{
            return new Enterpasswordpage();
        }
            
          

           
   
    }
  
   
}