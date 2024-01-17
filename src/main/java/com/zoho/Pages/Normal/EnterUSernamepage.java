
package com.zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.zoho.Base.Pages.Constant;
import com.zoho.Base.Pages.ZohoBasePage;
import com.zoho.Base.Pages.ZohoPage;

public class EnterUSernamepage extends ZohoBasePage {

    public EnterUSernamepage() {
        PageFactory.initElements(getcurrentDriver(), this);
    }

    @FindBy(id = Constant.USER_ID)
    WebElement userEmail;

    @FindBy(id = Constant.next_Button)
    WebElement nextButton;

    public void submitUserName() {
        userEmail.sendKeys(Constant.userName);
        nextButton.click();

    }

    public ZohoPage gotoEnterPasswordpage() {

        return new Enterpasswordpage();

    }
}