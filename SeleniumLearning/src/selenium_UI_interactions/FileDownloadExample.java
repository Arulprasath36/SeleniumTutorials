package selenium_UI_interactions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(
				By.linkText("Download xls"));
		
		downloadLink.click();
		
		Thread.sleep(3000);
		
		
		File fileLocation= new File("C:\\Users\\Elcot\\Downloads");
		
		File[] totalFiles=fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("download.xls")){
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
		
		
		
	}

}
