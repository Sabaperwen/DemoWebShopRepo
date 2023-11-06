package SignUp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)

public class DWS_Reister_02_Test extends BaseClass {
	@Test
	public void register_to_the_application()
	{
		registerPage.getRegisterLink().click();
		registerPage.getGender().click();
		logger.log(Status.INFO, "clicked on female gender");
		registerPage.getFirstName().sendKeys("Saba");
		logger.log(Status.INFO, "entering data into firstNameTf ");
		registerPage.getLastName().sendKeys("saba123@gmail.com");
		logger.log(Status.INFO, "enetered data into LastNameTf");
		registerPage.getPswrd().sendKeys("saba8936");
		logger.log(Status.INFO, "entered pswrd into pswrdTf");
		registerPage.getCnfrmPswrd().sendKeys("saba8936");
		logger.log(Status.INFO, "cnfrm pswrd");
	}

}
