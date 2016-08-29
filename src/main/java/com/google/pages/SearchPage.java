package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.objects.AbstractBasePage;

public class SearchPage extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='rso']//div/h3/a[@href='http://gatonegrohandmade.com.ua/']")
	private WebElement gatonegrohandmadeLink;
	@FindBy(xpath = "//*[@id='rso']/div//h3/a[@href='http://gatonegro.cl/']")
	private WebElement gatonegroLink;

	public SearchPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public GatonegrohandmadePage clickOnGatonegrohandmadeButton() {

		waitAndClick(gatonegrohandmadeLink);
		return new GatonegrohandmadePage(driver);

	}
	
	public GatonegroPage clickOnGatoNegroButton() {
		
		waitAndClick(gatonegroLink);
		return new GatonegroPage(driver);
		
	}

}
