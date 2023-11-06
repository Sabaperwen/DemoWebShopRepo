package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenshotUtility {

	WebDriver driver;
	TakesScreenshot ts;
	public TakesScreenshotUtility(WebDriver driver)
	{
		this.driver=driver;
		ts=(TakesScreenshot)this.driver;
		
	}
	

	public String capturingScreenshot(String ScreenshotName)
	{
		File pic = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(':', '-');
//it will display the local time in string format..to remove : we are using replace instead of semi column - we have to put 		
		
		String directory =System.getProperty("user.dir");
				
//it will give u the proper path where it is means which folder eclipse is there and inside eclipse which project that folder is there
//after that we will store the path in directory..
		
	  String path=""+directory+".//target//Screenshot//"+ScreenshotName+""+time+".png";
	  
//here the half path is in directory it means the folder where eclipse is there to inside eclipse in which project the folder is there 	  
		File destination=new File(path);
		try {
			FileUtils.copyFile(pic, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
		
	}
}
