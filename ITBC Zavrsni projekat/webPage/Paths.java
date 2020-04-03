package webPage;

public class Paths {

	// xpath za glavni meni WOMEN (za mouseOver)
	public static String MainMenuWomen_Xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	// xpatx za glavni meni DRESSES
	
	public static String MainMenuDresses_Xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
	// xpath za podmeni WOMEN>Summer Dresses
	private static String WomenSummerDresses_Xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";
	// xpath za podmeni DRESSES>Summer Dresses
	public static String DressesSumerDresses_Xpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
	// xpath za prvu haljinu kategorije Summer Dresses
	public static String FirstDress_Xpath = "//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	// xpath plus(povecaj kolicinu) u korpi
	public static String plus_Xpath = "//a[@class='btn btn-default button-plus product_quantity_up']";
	// xpath za plavu boju
	public static String blue_Xpath = "//a[@id='color_14']";
	// xpath za list
	public static String list_Xpath = "//li[@id='list']";
	// xpath za select_size
	public static String size_Xpath = "//select[@id='group_1']";
	// xpath za addToCart
	public static String addToCart_Xpath = "//button[@name='Submit']";
	// xpath za proveru artikala u korpi
	public static String cartDesript_Xpath = "//td[@class='cart_description']";
	// xpath za proveru kolicine artikala u korpi
	public static String checkQuantity_Xpath = "//input[@name='quantity_5_24_0_0']";
	// dugme za Proceed to checkout
	public static String checkOut_Xpath = "//a[@class='button btn btn-default standard-checkout button-medium']";
	// polje za unos mejla za registraciju
	public static String emailReg_Xpath = "//input[@id='email_create']";
	// dugme create an account
	public static String createAccount_Xpath = "//button[@id='SubmitCreate']";
	// login xpath
	public static String logIn_Xpath = "//a[@class='login']";
	// logout
	public static String logOut_Xpath = "//a[@class='logout']";
	// kontrola pre registracije da li je ostao ulogovan korisnik
	public static String checkLogedIn_Xpath = "//div[@class='nav']";
	// email polje za logovanje
	public static String emailLogIn_Xpath ="//input[@id='email']";
	//password polje za logovanje
	public static String passLogIn_Xpath ="//input[@id='passwd']";
	//login submit button
	public static String loginSubmit = "//p[@class='submit']//span[1]";
	

	///////////////////////////////////////
	// REG FORMA //
	/////////////////////////////////////

	// First name

	public static String regFirstName_Xpath = "//input[@id='customer_firstname']";

	public static String regLastName_Xpath = "//input[@id='customer_lastname']";

	public static String regEmail_Xpath = "//input[@id='email']";

	public static String regPass_Xpath = "//input[@id='passwd']";

	public static String regAddress_Xpath = "//input[@id='address1']";

	public static String regCity_Xpath = "//input[@id='city']";

	public static String stateSelect_Xpath = "//select[@id='id_state']";

	public static String postCode_Xpath = "//input[@id='postcode']";

	public static String regPhone_Xpath = "//input[@id='phone_mobile']";

	public static String submitButton_Xpath = "//button[@id='submitAccount']";

	public static String getWomenSummerDresses_Xpath() {
		return WomenSummerDresses_Xpath;
	}

}
