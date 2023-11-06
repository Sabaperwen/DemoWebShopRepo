package AddToCart;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)
public class DWS_Add_Product_Into_Cart_06_Test extends BaseClass{
	//test is mandatory to write at the end of Class name or test case 
	@Test
	public void addToCart() throws InterruptedException
	{
		cartpage.getBook().click();
		logger.log(Status.INFO, "clicked on book");
		System.out.println("clicked on Book module");
		cartpage.getProductname().click();
		System.out.println("clicked on book");
		cartpage.getAddToCart().click();
		logger.log(Status.INFO, "clicked on add to cart");
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("product added");
		cartpage.getShoppingCart().click();
		System.out.println("clicked on shopping cart");
        WebElement verifyingBook =cartpage.getProductname();
		if(verifyingBook.isDisplayed())
		{
			System.out.println("book is displaying in shopping list");
		}
		else
		{
			System.out.println("book is not displaying in shopping cart");
		}
	}
}


