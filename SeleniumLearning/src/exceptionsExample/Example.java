package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				
		"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://kamranahmed.info/toast");
		driver.manage().window().maximize();

		WebElement runCode=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/a"));
		runCode.click();
		
		WebElement link=driver.findElement(By.linkText("Quick Demos"));
		link.click();

	}

}
