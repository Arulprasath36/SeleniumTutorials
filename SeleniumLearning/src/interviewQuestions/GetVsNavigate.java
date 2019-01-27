package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Difference between get and navigate to
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		//driver.get("http://www.google.co.in");//DOM appear wait
		
		driver.navigate().to("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Duckling"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
