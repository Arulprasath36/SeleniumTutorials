package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SleepVsSetSpeed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();		
		driver.navigate().to("http://www.google.co.in");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Duckling"+Keys.ENTER);

		//There is no setSpeed method in Webdriver

	}

}
