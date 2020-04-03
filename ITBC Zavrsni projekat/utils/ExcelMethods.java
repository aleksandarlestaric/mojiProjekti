package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webPage.Methods;
import webPage.PageURLs;
import webPage.Paths;

public class ExcelMethods {

	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	//private static XSSFCell cell;

	public static void setExcel() {

		try {
			FileInputStream fi = new FileInputStream(PageURLs.EXCEL_LOC);
			wb = new XSSFWorkbook(fi);
			sheet = wb.getSheetAt(0);
			// DataFormatter dataFormatter = new DataFormatter();
		} catch (Exception e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}

	}

	public static String ucitajIzEksela(int i, int j) {

		DataFormatter dataFormatter = new DataFormatter();
		String temp = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j)).toString();

		return temp;

	}

	public static void upisiUExcel(int row, int column, String data) {
		sheet.getRow(row).createCell(column).setCellValue(data);
		try {
			FileOutputStream fos = new FileOutputStream(PageURLs.EXCEL_LOC);
			wb.write(fos);
			fos.close();

		} catch (Exception e) {
			System.out.println("ERROR!");
		}
	}

	public static void regUsers(WebDriver dr, int i) {
		// DataFormatter dataFormatter = new DataFormatter();
		// setExcel();
		klik(dr, Paths.regEmail_Xpath);
		unesiTekst(dr, Paths.emailReg_Xpath, ucitajIzEksela(i, 3));
		klik(dr, Paths.createAccount_Xpath);
		sacekaj();
		klik(dr, Paths.regFirstName_Xpath);
		unesiTekst(dr, Paths.regFirstName_Xpath, ucitajIzEksela(i, 1));
		klik(dr, Paths.regLastName_Xpath);
		unesiTekst(dr, Paths.regLastName_Xpath, ucitajIzEksela(i, 2));
		klik(dr, Paths.regPass_Xpath);
		unesiTekst(dr, Paths.regPass_Xpath, ucitajIzEksela(i, 4));
		klik(dr, Paths.regAddress_Xpath);
		unesiTekst(dr, Paths.regAddress_Xpath, ucitajIzEksela(i, 5));
		klik(dr, Paths.regCity_Xpath);
		unesiTekst(dr, Paths.regCity_Xpath, ucitajIzEksela(i, 6));
		Methods.selectMethod(dr, ucitajIzEksela(i, 7), Paths.stateSelect_Xpath);
		klik(dr, Paths.postCode_Xpath);
		unesiTekst(dr, Paths.postCode_Xpath, ucitajIzEksela(i, 8));
		klik(dr, Paths.regPhone_Xpath);
		unesiTekst(dr, Paths.regPhone_Xpath, ucitajIzEksela(i, 9));
		sacekaj();
		klik(dr, Paths.submitButton_Xpath);
		sacekaj();
		klik(dr, Paths.logOut_Xpath);
		sacekaj();

	}

	public static void klik(WebDriver wd, String str) {
		wd.findElement(By.xpath(str)).click();
	}

	public static void unesiTekst(WebDriver wd, String xpath, String str) {
		wd.findElement(By.xpath(xpath)).sendKeys(str);
	}

	public static void sacekaj() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
