package emailSend;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)
public class DWS_Email_Send_10_Test extends BaseClass {
	@Test
	public void emailSend()
	{
		emailPage.getProduct().click();
		logger.log(Status.INFO, "clicked on product");
		emailPage.getEmailFrnd().click();
		emailPage.getFrndEmail().sendKeys("sabaprwn12345@gmail.com");
		emailPage.getUrsEmail().sendKeys("sabaprwn12345@gmail.com");
		emailPage.getSendEmail().click();
		WebElement msg = emailPage.getEmailMsg();
		if(msg.isDisplayed())
		{
			System.out.println("error msg coming");
		}
		else
		{
			System.out.println("error msg is not coming");
		}
	}

}
