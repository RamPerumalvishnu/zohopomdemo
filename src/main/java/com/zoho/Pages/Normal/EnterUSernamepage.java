
package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoBasePage;
import com.Zoho.Base.Pages.ZohoPage;

public class EnterUSernamepage extends ZohoBasePage {

   

    @FindBy(id = Constant.USER_ID)
    WebElement userEmail;

    @FindBy(id = Constant.next_Button)
    WebElement nextButton;

    public ZohoPage submitUserName() {
        userEmail.sendKeys(Constant.userName);
        nextButton.click();
        return this;
    }
    public ZohoPage gotoEnterpasswordPage() {
      
        nextButton.click();
        return this;
    }
   
}