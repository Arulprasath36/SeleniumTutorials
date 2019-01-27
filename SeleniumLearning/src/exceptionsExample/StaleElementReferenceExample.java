package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Agni"+Keys.ENTER);
		//WebElement searchBox1=driver.findElement(By.name("q"));
		searchBox.clear();
	
	}

}
