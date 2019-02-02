package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
	
		/*NOTE : As I have set the PATH for Chrome driver already I'm not using 
		System.setProperty()
		*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of Thrones");
		Thread.sleep(5000);
		List<WebElement> searchSuggestions=
		driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		//int position=0;
		for (WebElement webElement : searchSuggestions) {
			String text=webElement.getText();
		      System.out.println(text);
		      if(text.contains("cast")){
		    	  webElement.click();
		    	 break;
		      }
		      
		     // position++; 
		      
		      /*if(position==3){
		    	  webElement.click();
		    	  break;  
		      }*/
		}
		
		
		
	}

}
