package genericUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author Saba Perween
 *
 */
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	JavascriptExecutor js;
	public  WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor) driver;
	}
	/**
	 * This method is used to clicking on elements=using javaScriptexecutor
	 * @param element
	 */
	public void clickONElements(WebElement element)
	{
		
		js.executeScript("arguments[0].click()", element);
	}
	/**
	 * This method is used to enter the data using javaScriptExecutor
	 * @param searchbar
	 * @param data
	 */
	
	public void enteringDataIntoElement(WebElement searchbar,String data )
	{
		js.executeScript("arguments[0].value='"+data+"'", searchbar);
	}
	
	 public WebDriverWait explicitWaitRefrence(int time)
	 {
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	   return wait;
	 }
	
//	//old approach
//	public  void  clickingOnElements(WebDriver driver, WebElement element)
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()",element);
//	}
	 
	 public Actions actionsRefrence()
	 {
		 Actions act=new Actions(driver);
		 return act;
	 }
	 
	 public void handlingDropDown(WebElement dropdown,String value)
	 {
		 Select select=new Select(dropdown);
		 try {
		 select.selectByValue(value);
	 }
		 catch(NoSuchElementException e)
		 {
			 select.selectByIndex(0);
		 }
		 catch(Exception e)
		 {
			 select.selectByIndex(Integer.parseInt(value));
		 }
		 } 
	 /**
	  * This method is used to ScrollTo action
	  * @param x
	  * @param y
	  */
	 
	 public void scrollToAction(int x,int y)
	 {
		 js.executeScript("window.scrollTo("+x+","+y+")");
	 }
	 
	 /**
	  * This method is used to perform Scroll by Actions
	  * @param x
	  * @param y
	  */
	 public void scrollByAction(int x,int y)
	 {
		 js.executeScript("window.scrollTo("+x+","+y+")");
	 }
	 
	 /**
	  * This method is used to perform scrollIntoView.
	  * if we will give status as true the web page will scroll until the element is visible of the top of the page    
	  *if we will give status as false the web page will scroll until the element is visible of the bottom of the page    

	  * @param element
	  * @param status
	  */
	 public void scrollIntoViewActions(WebElement element, Boolean status)
	 {
		 js.executeScript("arguments[0].scrollIntoView("+status+")",element);
	 }
	 
	 /**
	  * This method is used to switch the driver  control from window to frame by giving index value of the frame
	  * @param index
	  */
	 public void switchingToFrame(int index)
	 {
		 driver.switchTo().frame(index);
	 }
	 
	 /**
	  * This method is used to switch the driver control from window to frame by giving String value of the frame
	  * @param name
	  */
	 public void switchingToFrame(String name)
	 {
		 driver.switchTo().frame(name);
	 }
	 /**
	  * This method is used to switch the driver control from window to frame
	  * @param element
	  */
	 public void switchingToFrame(WebElement element)
	 {
		 driver.switchTo().frame(element);
	 }
	 
	 /**
	  * This method is used to switch back the driver control to main window 
	  */
	 public void switchingBackToMainWindow()
	 {
		driver.switchTo().defaultContent(); 
	 }
	 
	 
	 

}
