package AddToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ItestListnerUtility;
@Listeners(ItestListnerUtility.class)
public class ChangeToSomething_01_Test extends BaseClass {
@Test
	public void change() {
		System.out.println("changing");
		System.out.println("new changing");

	}

}
