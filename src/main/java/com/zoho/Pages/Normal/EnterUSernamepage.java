
package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.HsbcBasePage;
import com.Zoho.Base.Pages.HsbcPage;

public class EnterUSernamepage extends HsbcBasePage {

   

    @FindBy(id = Constant.USER_ID)
    WebElement userEmail;

    @FindBy(id = Constant.next_Button)
    WebElement nextButton;

    public HsbcPage submitUserName() {
        userEmail.sendKeys(Constant.userName);
        nextButton.click();
        return this;
    }
    public HsbcPage gotoEnterpasswordPage() {
      
        nextButton.click();
        return this;
    }
   
}