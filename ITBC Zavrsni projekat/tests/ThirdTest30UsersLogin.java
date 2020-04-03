package tests;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.ExcelMethods;
import webPage.Methods;
import webPage.PageURLs;
import webPage.Paths;

public class ThirdTest30UsersLogin {
	@Test
	public static void checkRegisteredUsers() {
		ExcelMethods.setExcel();
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
			Methods.klik(dr, Paths.emailLogIn_Xpath);
			Methods.unesiTekst(dr, Paths.emailLogIn_Xpath, ExcelMethods.ucitajIzEksela(i, 3));
			Methods.klik(dr, Paths.passLogIn_Xpath);
			Methods.unesiTekst(dr, Paths.passLogIn_Xpath, ExcelMethods.ucitajIzEksela(i, 4));
			Methods.klik(dr, Paths.loginSubmit);
			Methods.klik(dr, Paths.logOut_Xpath);
			Methods.sacekaj();
		}

	}
}
