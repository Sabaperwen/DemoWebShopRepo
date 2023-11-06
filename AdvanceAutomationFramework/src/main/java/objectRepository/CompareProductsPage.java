package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProductsPage {
	public CompareProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getSelectComputer() {
		return selectComputer;
	}

	public WebElement getCompareProducts() {
		return compareProducts;
	}

	public WebElement getSecondProduct() {
		return secondProduct;
	}

	@FindBy(linkText = "Computers")
	private WebElement computers;

	@FindBy(xpath = "//img[@alt='Picture for category Desktops']")
	private WebElement desktop;

	@FindBy(linkText = "Build your own cheap computer")
	private WebElement selectComputer;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement compareProducts;

	@FindBy(linkText = "Build your own computer")
	private WebElement secondProduct;
	
	@FindBy(linkText = "Jewelry")
	private WebElement jwellery;
	
	@FindBy(xpath = "//span[text()='0.00']")
	private WebElement priceFilter;
	
	@FindBy(xpath = "//span[@class='price actual-price']")
	private List<WebElement> allPrizes;

	public WebElement getJwellery() {
		return jwellery;
	}

	public WebElement getPriceFilter() {
		return priceFilter;
	}

	public List<WebElement> getAllPrizes() {
		return allPrizes;
	}
	
	@FindBy(xpath = "//input[@value='Remove']")
	private List<WebElement> removeButtons;

	public List<WebElement> getRemoveButton() {
		return removeButtons;
	}
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement getSecondCompareListProduct;

	public List<WebElement> getRemoveButtons() {
		return removeButtons;
	}

	public WebElement getSecondCompareListProduct() {
		return getSecondCompareListProduct;
	}

	}
	
	
	

	

