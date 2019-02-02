package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample {
	//static WebElement q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");	
		driver.switchTo().activeElement().sendKeys("Trichy \n");
		
		/*PageFactory.initElements(driver, ActiveElementExample.class);
		
		q.sendKeys("Trichy");*/
	}

}
