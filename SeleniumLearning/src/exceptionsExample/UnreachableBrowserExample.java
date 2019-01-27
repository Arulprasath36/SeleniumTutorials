package exceptionsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UnreachableBrowserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\Elcot\\Desktop\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");

		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.co.in");
	}

}
