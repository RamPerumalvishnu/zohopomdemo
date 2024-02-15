package com.Zoho.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Base.Pages.ZohoPage;
import com.Zoho.Pages.Normal.EnterUSernamepage;
import com.Zoho.Pages.Normal.Enterpasswordpage;
import com.Zoho.Session.ZohoTestSession;

public class LoginTest {

	ZohoTestSession session;

	@BeforeMethod
	public void init() {

		session = new ZohoTestSession();
	}

	@AfterMethod
	public void quit() {
		session.generateReports();
	}

	@Test
	public void login() {

		// System.out.println(System.getProperty("user.dir"));
		String userNameValid="Y";
		String userName="lramkumar89@yahoo.com";
		String password="Thamizh@2024";

		ZohoPage page=session
				.init("LoginTest")
				.openBrowser("Chrome")
				.gotoHomepage()
				.validator(false).validateTitle("Homapage" ,Constant.HOME_TITLE)
				.validator(false).validateText(Constant.HOMEPAGE_TEXT_LOCATOR,Constant.expectedHomepageText)
				//.validator(false).validateElementPresence(Constant.SIGN_IN_LINK_LOCATOR)
				.gotoEnterUserNamePage()
				.submitUserName(userName);
				if(page instanceof EnterUSernamepage & userNameValid.equals("Y") )
				{
					
					
					
					page.validator(true).fail("Could not Login with valid userName");
				}else if(page instanceof Enterpasswordpage ){

					System.out.println("EnteruserName page");
					if(userNameValid.equals("N"))
					{
					page.validator(true).fail("Able to enter and submit invalid username "+ userNameValid);
					}else{

						page.submitPassword(password);
					}
				}
				
		session.end();

	}

}
