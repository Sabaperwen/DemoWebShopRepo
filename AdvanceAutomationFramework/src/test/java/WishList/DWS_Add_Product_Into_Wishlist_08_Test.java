package WishList;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;

@Listeners(ItestListnerUtility.class)
public class DWS_Add_Product_Into_Wishlist_08_Test extends BaseClass {
	@Test
	public void AddProductIntoWishlist() 
	{
		wishlist.getJwelry().click();
		System.out.println("cliked on jwellery");
		wishlist.getProduct().click();
		System.out.println("clixked on products");
		wishlist.getCentimtrTF().sendKeys("50");
		System.out.println("entering lentgh size in cm");
		wishlist.getAddToWishList().click();
		System.out.println("add product into wishlist");
		wishlist.getWishlist().click(); 
		WebElement productName = wishlist.getProductName();
		if(productName.isDisplayed())
		{
			System.out.println("product added into wishlist");
		}
		else
		{
			System.out.println("product not added in wishlist");
		}
	}

}
