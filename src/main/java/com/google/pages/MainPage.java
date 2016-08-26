package com.google.pages;

import com.base.objects.AbstractBasePage;
import com.framwork.browser.BrowserWebDriver;
import com.framwork.browser.BrowserWebDriver.BrowserType;


public class MainPage extends AbstractBasePage{
	
	public StartPage openStartPage() {

		driver = BrowserWebDriver.startBrowser(BrowserType.CHROME);
		driver.get("https://www.google.com.ua");
		return new StartPage(driver);

	}

	public void closeBrowser() {

		driver.close();

	}

	public void quitBrowser() {

		driver.quit();

	}

}
