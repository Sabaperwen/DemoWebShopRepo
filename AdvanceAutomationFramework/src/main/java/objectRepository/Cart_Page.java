package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Books")
	private WebElement book;

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;

	@FindBy(xpath = "//img[@alt='Picture of Computing and Internet']")
	private WebElement validateBook;

	public WebElement getValidateBook() {
		return validateBook;
	}
	@FindBy(linkText = "Computing and Internet")
	private WebElement productname;

	public WebElement getProductname() {
		return productname;
	}

	@FindBy(xpath = "//input[@value='1']")
	private WebElement remove;

	public WebElement getRemove() {
		return remove;
	}
	@FindBy(xpath = "//img[@alt='Picture of Computing and Internet']")
	private WebElement productPic;

	public WebElement getProductPic() {
		return productPic;
	}
	public WebElement getBook() {
		return book;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getRemoveEnabled() {
		return removeEnabled;
	}
	public WebElement getUpdatCart() {
		return updatCart;
	}
	@FindBy(name = "removefromcart")
	private WebElement removeEnabled;

	@FindBy(name = "updatecart")
	private WebElement updatCart;
	
	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	private WebElement notification;

	public WebElement getNotification() {
		return notification;
	}

}

