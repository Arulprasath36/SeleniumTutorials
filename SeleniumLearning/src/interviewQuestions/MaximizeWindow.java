package interviewQuestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver= new ChromeDriver(chromeOptions);

		driver.get("http://www.google.co.in");
		
		//driver.manage().window().maximize();
		
		/*Dimension dimension= new Dimension(800, 500);

		driver.manage().window().setSize(dimension);*/
		
		
		
		
	}

}
