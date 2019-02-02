package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WaysToSearchInGoogle {

	public static void main(String[] args) throws AWTException {

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		
		//searchBox.sendKeys("Trichy"+Keys.ENTER);
		searchBox.sendKeys("Trichy \n");
		//searchBox.submit();
		/*Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		
	}

}
