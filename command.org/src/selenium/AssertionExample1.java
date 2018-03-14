package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertionExample1 {
	@Test
	public void assertion(){
		//Instantiation of driver object. To launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		//To open the URL
		driver.get("https://www.softwaretestingmaterial.com");
		//Actual title is "Software Testing Material - A site for Software Testers" 
		//We took title as "Software Testing Material" to make the test fail
		String Title = "Software Testing Material";
		String GetTitle = driver.getTitle();
		System.out.println("Assertion starts here...");
		try{
			Assert.assertEquals(Title, GetTitle);
		}catch (Throwable t){
			System.out.println("A blog for Software Testers");
		}
		driver.quit();
	}
}
