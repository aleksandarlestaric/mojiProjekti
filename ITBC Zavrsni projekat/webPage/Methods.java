package webPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelMethods;

public class Methods {

/////////////////////////////////////////////////////////////
//
//	WEBDRAJVER
//
////////////////////////////////////////////////////////////	

	public static WebDriver wd() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

/////////////////////////////////////////////////////////////
//
// METODA SACEKAJ ZA UCITAVANJE WEB ELEMENATA
//
////////////////////////////////////////////////////////////

	public static void sacekaj() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void wait(WebDriver wd, int time) {
		wd.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

/////////////////////////////////////////////////////////////
//
//	WEB METODE - CLICK, SENDKEYS, GET, NAVIGATE, SELECT, MOUSEOVER
//
////////////////////////////////////////////////////////////

	public static void klik(WebDriver wd, String str) {
		wd.findElement(By.xpath(str)).click();
	}

	public static void unesiTekst(WebDriver wd, String xpath, String str) {
		wd.findElement(By.xpath(xpath)).sendKeys(str);
	}

	public static void openPage(WebDriver wd, String str) {
		wd.get(str);
	}

	public static void navPage(WebDriver wd, String str) {
		wd.navigate().to(str);
	}

	public static void selectMethod(WebDriver wd, String velicina, String lista) {

		WebElement sel = wd.findElement(By.xpath(lista));
		Select sel1 = new Select(sel);
		sel1.selectByVisibleText(velicina);
	}

	public static void mouseOver(Actions ac, WebDriver wd, String str) {
		ac.moveToElement(wd.findElement(By.xpath(str))).perform();
	}

///////////////////////////////////////////////////////
//
//	GENERISANJE STRINGOVA ZA EMAIL, ZIP, OSTALA POLJA
//
///////////////////////////////////////////////////////

	public static String generateEmail() {
		String abc = "asdfghjklqwertyuiopzxcvbnm1234567890";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < 8) {
			int index = (int) (rnd.nextFloat() * abc.length());
			sb.append(abc.charAt(index));
		}
		String str = sb.toString() + "@" + generateString() + ".com";
		return str;

	}

	public static void genNewExcelEmails() {
		// TODO Auto-generated method stub
		ExcelMethods.setExcel();
		for (int i = 1; i < 31; i++) {

			ExcelMethods.upisiUExcel(i, 3, Methods.generateEmail());

		}
	}

	public static String generateNumber() {
		String abc = "123456789";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < 5) {
			int index = (int) (rnd.nextFloat() * abc.length());
			sb.append(abc.charAt(index));
		}
		String str = sb.toString();
		return str;

	}

	public static String generateString() {
		String abc = "asdfghjklqwertyuiopzxcvbnm";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < 7) {
			int index = (int) (rnd.nextFloat() * abc.length());
			sb.append(abc.charAt(index));
		}
		String str = sb.toString();
		return str;

	}

}
