package seleniumWaitsExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.navigate().to("https://www.phptravels.net/login");
				
				WebElement userName=driver.findElement(By.name("username"));
				userName.sendKeys("user@phptravels.com");
				
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("demouser");
				
				WebElement submit=driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
				submit.click();
				
			
				
		WebDriverWait wait = new WebDriverWait(driver, 20);	
				
		WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable(By.
					xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a")));	
			
		profile.click();
				
				//driver.quit();
	}

}
