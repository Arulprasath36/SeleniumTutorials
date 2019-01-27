package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidElementStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();

		driver.get("C:/Users/Elcot/Documents/HiddenField.html");
		
		WebElement textBox = driver.findElement(By.id("textID"));
		textBox.clear();
		//textBox.sendKeys("");
	}

}
