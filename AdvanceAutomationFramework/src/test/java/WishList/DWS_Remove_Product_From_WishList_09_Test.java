package WishList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;

@Listeners(ItestListnerUtility.class)
public class DWS_Remove_Product_From_WishList_09_Test extends BaseClass{
	@Test
	public void removeProduct()
	{
		wishlist.getJwelry().click();
		 System.out.println("cliked on jwellery");
		wishlist.getProduct().click();
		 System.out.println("clixked on products");
		wishlist.getCentimtrTF().sendKeys("50");
		 System.out.println("enetering lentgh size in cm");
		wishlist.getAddToWishList().click();
		 System.out.println("add product into wishlist");
		wishlist.getWishlist().click(); 
		 System.out.println("went wishlist");
		 wishlist.getRemoveEnabled().click();
		 wishlist.getUpdateWishlist().click();
//		 WebElement Tf = wishlist.getRemovingTf();
//		 Tf.clear();
//		 System.out.println("tf is cleared");
//		 Tf.sendKeys("0");
//		 System.out.println("enetered 0 into Tf");
//		 Tf.sendKeys(Keys.ENTER);
//		 System.out.println("product is removed");
//		 driver.navigate().refresh();
//		 wishlist.getWishlist().click();
//		 System.out.println("checking wishlist");
//		 WebElement emptlyList = wishlist.getEmpty();
//		 if(emptlyList.isDisplayed())
//		 {
//			 System.out.println("Now wishlist is empty");
//		 }
//		 else
//		 {
//			 System.out.println("wishlist is not empty");
//		 }
//		 

		 
	}
}
