package selenium_UI_interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");

		WebElement uploadButton=driver.findElement(By.name("filename"));

		uploadButton.click();
		// windows controls begins here

		Thread.sleep(3000);
		String	file="C:\\Users\\Elcot\\Downloads\\download.xls";

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
