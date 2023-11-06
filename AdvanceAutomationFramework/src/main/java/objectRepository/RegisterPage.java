package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id = "gender-female")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstName;
	
	@FindBy(id="LastName")
	private WebElement lastName;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement pswrd;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cnfrmPswrd;
	
	@FindBy(id="register-button")
	private WebElement rgstrButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswrd() {
		return pswrd;
	}

	public WebElement getCnfrmPswrd() {
		return cnfrmPswrd;
	}

	public WebElement getRgstrButton() {
		return rgstrButton;
	}

}
