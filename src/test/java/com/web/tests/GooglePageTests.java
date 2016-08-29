package com.web.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.base.objects.AbstractBaseTest;

public class GooglePageTests extends AbstractBaseTest {

	@BeforeClass
	public static void beforeClass() {

		startPage = mainPage.openStartPage();
		searchPage = startPage.searchGatoNegro();

	}
	
	@After
	public void AfterMethod() {
		
		searchPage.backToSearchPage();
		
	}

	@AfterClass
	public static void afterClass() {

		mainPage.quitBrowser();

	}

	@Test
	public void searchGoogle1() {
		
		gatonegrohandmadePage = searchPage.clickOnGatonegrohandmadeButton();
		Assert.assertEquals("Failed Element", true, gatonegrohandmadePage.checkOnHeaderLine());

	}
	
	@Test
	public void searchGoogle2() {
		
		gatonegroPage = searchPage.clickOnGatoNegroButton();
		Assert.assertEquals("Failed Element", true, gatonegroPage.checkOnHeaderLine());

	}

}
