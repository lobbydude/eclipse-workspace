package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaits {
	public static void main(String[] args) {
		//To create a new instance of Firefox Driver
		WebDriver driver = new FirefoxDriver();
		//Implicit Wait - Here the specified Implicit Wait time frame is 15 seconds.
		//It waits 15 seconds of time frame for the element to load. 
		//It throws an exception, if the element is not loaded within the specified time frame
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//To open a website "Software Testing Material"
		driver.get("http://www.SoftwareTestingMaterial.com");
		//To maximize the browser window
		driver.manage().window().maximize();
		//To close the browser
		driver.close();
	}
}
