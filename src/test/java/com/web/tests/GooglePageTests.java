package com.web.tests;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.base.objects.AbstractBaseTest;

public class GooglePageTests extends AbstractBaseTest{
	
	@BeforeClass
	public static void beforeClass() {

		startPage = mainPage.openStartPage();
		searchPage = startPage.searchGatoNegro();
		

	}
	
	@Test
	public void searchGoogle1() {
		
		Assert.assertEquals("Failed link", "http://gatonegrohandmade.com.ua/", searchPage.getLink1());
		
	}
	
	@Test
	public void searchGoogle2() {
		
		Assert.assertEquals("Failed link", "https://vk.com/gato_negro_handmade", searchPage.getLink2());
	
	}
	
	
	
	@AfterClass
	public static void afterClass() {

		mainPage.quitBrowser();

	}

}
