package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.objects.AbstractBasePage;

public class GatonegrohandmadePage extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='video-trigger']//h1[@class='headline']")
	private WebElement headLineGatonegrohandmade;

	public GatonegrohandmadePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean checkOnHeaderLine() {

		return waitAndCheck(headLineGatonegrohandmade);

	}

}
