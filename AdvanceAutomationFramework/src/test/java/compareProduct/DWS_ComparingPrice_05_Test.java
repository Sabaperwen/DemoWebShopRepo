package compareProduct;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)
public class DWS_ComparingPrice_05_Test extends BaseClass {
	@Test
	public void Demo_Test_Case_To_Comparing_price()
	{
		compare.getJwellery().click();
		compare.getPriceFilter().click();
		List<WebElement> allPrizes= compare.getAllPrizes();
		for(WebElement prize:allPrizes )//instead of all prizes we can write directly compare.getAllPrizes
		{
			String p=prize.getText().substring(0,3);
			int val = Integer.parseInt(p);
			if(val<=500)
			{
				System.out.println("the test case passed"+ prize.getText());
			}
			else
			{
				System.out.println("the test case failed");
			}
		}
	}
	

}
