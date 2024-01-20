package com.Zoho.Testcases;

import org.testng.annotations.Test;

import com.Zoho.Base.Pages.Constant;
import com.Zoho.Session.ZohoTestSession;

public class LoginTest {

	@Test
	public void login() {

		ZohoTestSession session = new ZohoTestSession();
		session
				.init()
				.openBrowser("Chrome")
				.gotoHomepage()
				.validator(false).validateTitle(Constant.HOME_TITLE)
				// .validator(true).validateTitle(Constant.HOME_TITLE)
				.gotoEnterUserNamePage()
				.validator(true).validateTitle(Constant.HOME_TITLE)
				.submitUserName()
				.gotoEnterpasswordPage();

		/*
		 * // System.out.println("printing"+ System.getProperty("user.dir"));
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "\\Driver\\chromedriver.exe");
		 * ChromeOptions options = new ChromeOptions();
		 * options.setBinary(
		 * "C:\\Users\\lramk\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 * // options.addArguments("--remote-allow-origins=*");
		 * WebDriver webdriver = new ChromeDriver(options);
		 * WebDriverListener listener = new ZohoEventListeners();
		 * WebDriver driver = new EventFiringDecorator(listener).decorate(webdriver);
		 * driver.get("https://www.Zoho.com/");
		 * driver.findElement(By.xpath(
		 * "/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click()
		 * ;
		 * ZohoPage p = new LaunchPage();
		 * p.gotoHomepage();
		 */
	};

}
