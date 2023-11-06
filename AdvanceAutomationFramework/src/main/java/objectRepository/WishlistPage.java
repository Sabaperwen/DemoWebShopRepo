package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Jewelry")
	private WebElement jwelry;
	
	@FindBy(linkText = "Create Your Own Jewelry")
	private WebElement product;
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement addToWishList;

	public WebElement getJwelry() {
		return jwelry;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddToWishList() {
		return addToWishList;
	}
	
	@FindBy (id = "product_attribute_71_10_16")
	private WebElement centimtrTF;

	public WebElement getCentimtrTF() {
		return centimtrTF;
	}
	@FindBy (xpath = "//span[text()='Wishlist']")
	private WebElement wishlist;
	
	@FindBy(linkText = "Create Your Own Jewelry")
	private WebElement productName;

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getProductName() {
		return productName;
	}
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement removingTf;

	public WebElement getRemovingTf() {
		return removingTf;
	}
	@FindBy(name = "removefromcart")
	private WebElement removeEnabled;
	
	public WebElement getRemoveEnabled() {
		return removeEnabled;
	}

	public WebElement getUpdateWishlist() {
		return updateWishlist;
	}
	@FindBy(name = "updatecart")
	private WebElement updateWishlist;
	
	@FindBy(className = "wishlist-content")
	private WebElement empty;

	public WebElement getEmpty() {
		return empty;
	}

}
