package selenium_UI_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
	    WebElement calendar=driver.findElement(By.id("datepicker"));
	  //  calendar.sendKeys("01/10/2019"+Keys.ENTER);
	    
	        
	    
	    calendar.click();
	    
	  WebElement nextButton=driver.findElement(
			  By.xpath(" //a[@title='Next']"));  
	  
	  nextButton.click();
	  
	//a[contains(text(),'10')]
	//*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[5]/a

	  
	  WebElement dateToBeGiven=driver.findElement(
			  By.xpath("//a[contains(text(),'10')]"));
	  
	  dateToBeGiven.click();
	}

}
