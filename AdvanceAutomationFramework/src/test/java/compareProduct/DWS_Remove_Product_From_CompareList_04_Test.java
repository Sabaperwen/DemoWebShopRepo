package compareProduct;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)
public class DWS_Remove_Product_From_CompareList_04_Test extends BaseClass {
	@Test
	public void Remove_Product_FRom_CompareList() throws InterruptedException
	{
		compare.getComputers().click();
		logger.log(Status.INFO, "Clicked on computer");
		System.out.println("Clicked on computer");

		compare.getDesktop().click();
		logger.log(Status.INFO, "Clicked on Desktop");
		 System.out.println("Clicked on Desktop");
		compare.getSelectComputer().click();
		logger.log(Status.INFO, "clicked on selected computer");
	     System.out.println("clicked on selected computer");

		compare.getCompareProducts().click();
		logger.log(Status.INFO, "product added in compare list");
        System.out.println("product added in compare list");
		driver.navigate().back();
		driver.navigate().back();

		compare.getSecondProduct().click();
		logger.log(Status.INFO, "second product added in compare list");
		compare.getSecondCompareListProduct().click();
		System.out.println("second product added in compare list");

		
		List<WebElement> allRemoveButtons = compare.getRemoveButton();
		
		try 
		{
			for(WebElement remove:allRemoveButtons)
			{
				remove.click();
				System.out.println("remove product from compare list");
			}
		} catch (Exception e) {

		}

	}

}
