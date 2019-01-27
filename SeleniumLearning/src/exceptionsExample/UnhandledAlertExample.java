package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alert=driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
		alert.click();
		
		WebElement getLabel=driver.findElement(
		By.xpath("//*[@id='contentblock']/section/div[1]/div/div/label"));
		
		
	}
}
