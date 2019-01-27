package exceptionsExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoSuchSessionExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.google.co.in");
		
		driver.quit();
		driver.findElement(By.name("q"));
		
	}

}
