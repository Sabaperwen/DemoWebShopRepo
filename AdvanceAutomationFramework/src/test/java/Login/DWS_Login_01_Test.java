 package Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)

public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider = "data", dataProviderClass = ExcelUtility.class)
	public void Login_to_application_with_valid_credentials(String email,String pswrd) throws InterruptedException
	{
		loginPage.getLoginLink().click();
		logger.log(Status.INFO, "clicked in login");
	
		loginPage.getEmailTf().sendKeys(email);
		logger.log(Status.INFO, "entered email in emailTf");
		loginPage.getPswrdTf().sendKeys(pswrd);

	}
}
