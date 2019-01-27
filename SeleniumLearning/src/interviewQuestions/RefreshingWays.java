package interviewQuestions;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RefreshingWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Agni");
	
	

		/*//Refresh command 
		driver.navigate().refresh();

		//Get current URL
		driver.get(driver.getCurrentUrl());

		//JavascriptExecutor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()");//history.go(0)

		Robot robot= new Robot();	
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);*/

	}

}
