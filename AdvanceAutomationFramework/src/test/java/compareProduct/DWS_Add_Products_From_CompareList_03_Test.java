package compareProduct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)

public class DWS_Add_Products_From_CompareList_03_Test extends BaseClass {
	@Test
	public void compare_products_From_compare_list()
	{
	compare.getComputers().click();
	
	compare.getDesktop().click();
	compare.getSelectComputer().click();
	compare.getCompareProducts().click();
	driver.navigate().back();
	driver.navigate().back();
	

	compare.getSecondProduct().click();
	List<WebElement> elements = driver.findElements(By.xpath("//input[@value='Remove']"));
	int count=0;
	for(WebElement buttonCount:elements )
	{
		count++;
		{
			if(count==2)
			{
				logger.log(Status.INFO,"product is added from compareList");
			}
		}
	}
	
	}

}
