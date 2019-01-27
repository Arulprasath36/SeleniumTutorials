package selenium_UI_interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();


		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);


		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2= driver.findElement(By.id("Click1"));
		button2.click();

		driver.switchTo().defaultContent();

		List<WebElement> totalFrames=	driver.findElements(By.tagName("iframe"));

		int size=	totalFrames.size();
		System.out.println(size);


	}

}
