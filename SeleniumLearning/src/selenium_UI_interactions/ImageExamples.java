package selenium_UI_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
	/*WebElement firstImage=driver.findElement(
			By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
	
firstImage.click();*/
	
	WebElement brokenImage=driver.findElement(
			By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
	//"naturalWidth" = 0
	
	if(brokenImage.getAttribute("naturalWidth").equals("0")){
		System.out.println(brokenImage.getAttribute("outerHTML")+"The image is broken");
	}else{
		System.out.println("The image is NOT broken");
	}
	
	}

}
