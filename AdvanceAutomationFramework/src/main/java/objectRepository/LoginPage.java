package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement emailTf;

	@FindBy(id="Password")
	private WebElement pswrdTf;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPswrdTf() {
		return pswrdTf;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
