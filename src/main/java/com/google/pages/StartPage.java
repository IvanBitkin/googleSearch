package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.objects.AbstractBasePage;

public class StartPage extends AbstractBasePage {

	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchField;

	public StartPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public SearchPage searchGatoNegro() {

		searchField.clear();
		searchField.sendKeys("Gato Negro", Keys.ENTER);

		return new SearchPage(driver);

	}

}
