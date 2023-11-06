package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email_Page {
public Email_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(linkText = "14.1-inch Laptop")
private WebElement product;

@FindBy(xpath = "//input[@value='Email a friend']")
private WebElement emailFrnd;

@FindBy(id = "FriendEmail")
private WebElement frndEmail;

public WebElement getProduct() {
	return product;
}

public WebElement getEmailFrnd() {
	return emailFrnd;
}

public WebElement getFrndEmail() {
	return frndEmail;
}

public WebElement getUrsEmail() {
	return ursEmail;
}

public WebElement getSendEmail() {
	return sendEmail;
}

public WebElement getEmailMsg() {
	return emailMsg;
}

@FindBy(id="YourEmailAddress")
private WebElement ursEmail;

@FindBy(name = "send-email")
private WebElement sendEmail;

@FindBy(xpath = "//li[text()='Only registered customers can use email a friend feature']")
private WebElement emailMsg;
}
