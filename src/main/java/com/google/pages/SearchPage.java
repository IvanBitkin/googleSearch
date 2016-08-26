package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.objects.AbstractBasePage;

public class SearchPage extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='rso']/div/div[1]/div/h3/a")
	private WebElement checklink1;
	@FindBy(xpath = "//div[@id='rso']/div/div[2]/div/h3/a")
	private WebElement checklink2;
	

	public SearchPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getLink1() {
		
		waitAndCheck(checklink1);
		return checklink1.getAttribute("href");

	}

	public String getLink2() {
		
		waitAndCheck(checklink2);
		return checklink2.getAttribute("href");

	}

	

}
