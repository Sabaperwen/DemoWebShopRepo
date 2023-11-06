package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Cart_Page;
import objectRepository.CompareProductsPage;
import objectRepository.Email_Page;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.WishlistPage;

public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	PropertyUtility property;
	public static TakesScreenshotUtility screenshot;
	public static WebDriverUtility webdriverutility;
	DataBaseUtility dbutility;
	JavaUtility jutility;
	public static ExtentTest logger;
	public static LoginPage loginPage;
	public static RegisterPage registerPage;
	public static CompareProductsPage compare;
	public static Cart_Page cartpage;
	public static WishlistPage wishlist;
	public static Email_Page emailPage;
	@BeforeClass(alwaysRun = true)
	public void launchingBrowserAndNavigateToApp()
	{
		property=new PropertyUtility();

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(options);
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			if(BROWSER.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new FirefoxDriver();

			}
		}
		driver.manage().window().maximize();

		driver.get(property.getDataFromPropertyFile("url"));
		screenshot=new TakesScreenshotUtility(driver);
		webdriverutility=new WebDriverUtility(driver);
		dbutility=new DataBaseUtility();
		jutility=new JavaUtility();
	}


	@BeforeMethod(alwaysRun = true)
	public void loginToApplication()
	{
		System.out.println("logged in to application");
		loginPage=new LoginPage(driver); 
		registerPage=new RegisterPage(driver);
		compare=new CompareProductsPage(driver);
		cartpage=new Cart_Page(driver);
		wishlist=new WishlistPage(driver);
		emailPage=new Email_Page(driver);
	}
	

	@AfterMethod(alwaysRun = true)
	public void LoggOutFromApplication()
	{
		System.out.println("logged out from Application");
	}
	

	@AfterClass(alwaysRun = true)
	public void tearDownTheBrowser()
	{
		driver.quit();
	}













}
//	public static WebDriver driver;
//	public static TakesScreenshotUtility uti;
//	
//	@BeforeMethod
//	public static void demo()
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		
//		
//		driver= new ChromeDriver(options);
//		
//		driver.manage().window().maximize();
//		uti=new TakesScreenshotUtility(driver);
//}
//***************************************************************************



