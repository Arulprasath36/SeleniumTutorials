package interviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
	
		driver.findElement(By.
		xpath("//*[@id='contentblock']/section/div[1]/div/div/button")).click();
		
		//Take a screenshot here
		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("D://sample.png");
		FileHandler.copy(sourceFile, destinationFile);*/
		
		Robot robot = new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destinationFile=new File("D://robotsnap.png");
		ImageIO.write(source, "png", destinationFile);
	}

}
