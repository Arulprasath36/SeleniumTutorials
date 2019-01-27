package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
	
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("http://www.google.co.in");
	WebElement searchBox=driver.findElement(By.name("qb"));
	searchBox.sendKeys("Agni"+Keys.ENTER);
	
	
		
	}
}
