package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.objects.AbstractBasePage;

public class GatonegroPage extends AbstractBasePage {

	@FindBy(xpath = "//div[@class='container']//h1//img[@alt='GatoNegro']")
	private WebElement gatonegroLink;

	public GatonegroPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public boolean checkOnHeaderLine() {

		return waitAndCheck(gatonegroLink);

	}

}
