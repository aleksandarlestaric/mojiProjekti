package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import webPage.Methods;
import webPage.PageURLs;
import webPage.Paths;
public class FirstTests {
	private static String test1url;
	public static String test2url;
	
	@Test (priority = 1)
	public static void WomenSummerDressesTest() {
		
		WebDriver dr =Methods.wd();
		Methods.wait(dr, 3);
		Methods.openPage(dr, PageURLs.getHome());
		PageURLs.openHomePage(dr); 
		dr.manage().window().maximize();
		Actions ac = new Actions(dr);
		Methods.mouseOver(ac, dr, Paths.MainMenuWomen_Xpath);
		Methods.klik(dr, Paths.getWomenSummerDresses_Xpath());
		test1url=dr.getCurrentUrl();
		Assert.assertEquals(PageURLs.SUMMER_DRESSES_PAGE, dr.getCurrentUrl());
		//if (PageURLs.SUMMER_DRESSES_PAGE.equalsIgnoreCase(dr.getCurrentUrl())) System.out.println("uspesno");
		dr.close();
	
	}
	
	@Test (priority = 2)
	public static void test2() {
		WebDriver dr = Methods.wd();
		Methods.wait(dr, 3);
		Methods.openPage(dr, PageURLs.getHome());
		dr.manage().window().maximize();
		Actions ac = new Actions(dr);
		Methods.mouseOver(ac, dr, Paths.MainMenuDresses_Xpath);
		Methods.klik(dr, Paths.DressesSumerDresses_Xpath);
		test2url=dr.getCurrentUrl();
		Assert.assertEquals(PageURLs.SUMMER_DRESSES_PAGE, test2url);
		dr.close();
		
	}
	
	@Test (priority = 3)
	public static void compareLinks () {
		Assert.assertEquals(test1url, test2url);
	}
	
	@Test (priority = 4)
	public static void test4() {
		WebDriver dr = Methods.wd();
		Methods.openPage(dr, PageURLs.SUMMER_DRESSES_PAGE);
		Methods.wait(dr, 7);
		dr.manage().window().maximize();
		Methods.klik(dr, Paths.list_Xpath);
		Methods.klik(dr, Paths.FirstDress_Xpath);
		Methods.klik(dr, Paths.plus_Xpath);
		Methods.klik(dr, Paths.blue_Xpath);
		Methods.selectMethod(dr,"M",Paths.size_Xpath);
		Methods.klik(dr, Paths.addToCart_Xpath);
		Methods.sacekaj();
		Methods.openPage(dr, PageURLs.CART_PAGE);
		Assert.assertTrue(dr.findElement(By.xpath(Paths.cartDesript_Xpath)).getText().contains("Printed Summer Dress"));
		Assert.assertTrue(dr.findElement(By.xpath(Paths.cartDesript_Xpath)).getText().contains("Color : Blue, Size : M"));
		Assert.assertEquals(dr.findElement(By.xpath(Paths.checkQuantity_Xpath)).getAttribute("value"), "2");
		Methods.klik(dr, Paths.checkOut_Xpath);
		Methods.unesiTekst(dr, Paths.emailReg_Xpath, Methods.generateEmail());
		Methods.klik(dr, Paths.createAccount_Xpath);
		Methods.klik(dr, Paths.regFirstName_Xpath);
		Methods.unesiTekst(dr, Paths.regFirstName_Xpath, Methods.generateString());
		Methods.klik(dr, Paths.regLastName_Xpath);
		Methods.unesiTekst(dr, Paths.regLastName_Xpath, Methods.generateString());
		Methods.klik(dr, Paths.regPass_Xpath);
		Methods.unesiTekst(dr, Paths.regPass_Xpath, Methods.generateString());
		Methods.klik(dr, Paths.regAddress_Xpath);
		Methods.unesiTekst(dr, Paths.regAddress_Xpath, Methods.generateString());
		Methods.klik(dr, Paths.regCity_Xpath);
		Methods.unesiTekst(dr, Paths.regCity_Xpath, Methods.generateString());
		Methods.selectMethod(dr, "Alabama", Paths.stateSelect_Xpath);
		Methods.klik(dr, Paths.postCode_Xpath);
		Methods.unesiTekst(dr, Paths.postCode_Xpath, Methods.generateNumber());
		Methods.klik(dr, Paths.regPhone_Xpath);
		Methods.unesiTekst(dr, Paths.regPhone_Xpath, Methods.generateNumber());
		Methods.klik(dr, Paths.submitButton_Xpath);
		Assert.assertEquals(dr.findElement(By.xpath(Paths.logOut_Xpath)).getText(), "Sign out");
		dr.close();
		
	}
}
