package selenium_UI_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTipExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement name=driver.findElement(By.id("age"));

		String toolTipText=	name.getAttribute("title");
		System.out.println(toolTipText);


	}

}
