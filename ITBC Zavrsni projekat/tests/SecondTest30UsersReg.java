//////////////////////////////////////
//
//
//	TEST ZA REGISTRACIJU 30 KORISNIKA
//
/////////////////////////////////////

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.ExcelMethods;
import webPage.Methods;
import webPage.PageURLs;
import webPage.Paths;

public class SecondTest30UsersReg {
	@Test
	public static void reg30Users() {
		ExcelMethods.setExcel();
		Methods.genNewExcelEmails();

		WebDriver dr = Methods.wd();
		Methods.wait(dr, 4);
		Methods.openPage(dr, PageURLs.getHome());
		dr.manage().window().maximize();
		if (dr.findElement(By.xpath(Paths.checkLogedIn_Xpath)).getText().contains("Sign out")) {
			Methods.klik(dr, Paths.logOut_Xpath);
			Methods.sacekaj();

		}

		Methods.klik(dr, Paths.logIn_Xpath);
		Methods.sacekaj();

		for (int i = 1; i < 31; i++) {

			ExcelMethods.regUsers(dr, i);

		}

	}
}
