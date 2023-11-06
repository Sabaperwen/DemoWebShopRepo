package genericUtilities;

import java.util.Random;
/**
 * 
 * @author Saba Perween
 *
 */

public class JavaUtility {
	/**
	 * This method is developed to generate random numbers
	 * @param range
	 * @return
	 */
	public int generateRandomNumber(int range)
	{
		Random r=new Random();
		return r.nextInt(range);
		
		
	}

}
