package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//this is author name we will write above the class
/**
 * 
 * @author Saba Perween
 *
 */


public class PropertyUtility implements IAutoConstants  {
//we are reading the data from propertyfile and returning to required class
	//only one value we will get at a time like property.geturl,property.getUn
	
	
	//This is java doc file we will write above on the method:->>>>>>>>>
	/**
	 * This method is developed to read the data from property file.
	 * This method accept key of which parameter you want to fetch
	 * @param key
	 * @return value of the key
	 */
	
	public String getDataFromPropertyFile(String key)
	{
		FileInputStream fis=null;
	  try {
		 fis=new FileInputStream(PROPERTY_fILE_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Properties property=new Properties();
	  try {
		property.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



		return property.getProperty(key);
	}

}
