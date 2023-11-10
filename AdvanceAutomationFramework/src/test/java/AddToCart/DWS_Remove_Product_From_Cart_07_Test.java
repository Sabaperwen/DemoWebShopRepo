 package AddToCart;


import java.time.Duration;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;

@Listeners(ItestListnerUtility.class)
public class DWS_Remove_Product_From_Cart_07_Test extends BaseClass {
	@Test
	public void RemoveProductFromCart() throws InterruptedException
	{
		cartpage.getBook().click();
		System.out.println("clicked on book module");
		cartpage.getProductname().click();
		System.out.println("clicked on book");
		cartpage.getAddToCart().click();
		System.out.println("product is added");
		cartpage.getShoppingCart().click();
		System.out.println("clicked on shopping cart");
		//Thread.sleep(Duration.ofSeconds(5));
		cartpage.getRemoveEnabled().click();
		System.out.println("clicked on remove box");
		cartpage.getUpdatCart().click();
		System.out.println("product removed");

		}
}

