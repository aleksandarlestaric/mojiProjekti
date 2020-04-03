package webPage;

import org.openqa.selenium.WebDriver;

public class PageURLs {

	private static final String HOME_PAGE = "http://automationpractice.com/index.php";
	public static final String SUMMER_DRESSES_PAGE = "http://automationpractice.com/index.php?id_category=11&controller=category";
	public static final String CART_PAGE = "http://automationpractice.com/index.php?controller=order";
	public static final String MYACCOUNT_PAGE = "http://automationpractice.com/index.php?controller=my-account";
	public static final String EXCEL_LOC = "UserData.xlsx";
	
	public static void openHomePage(WebDriver driver) {
		driver.get(HOME_PAGE);
	}
	
	public static void navigateToHomePage (WebDriver driver) {
		driver.navigate().to(HOME_PAGE);
	}
	public static String getHome () {
		return HOME_PAGE;
	}
	
	
	

}
