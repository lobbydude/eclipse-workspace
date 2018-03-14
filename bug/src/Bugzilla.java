

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Bugzilla {
	@Test
	public static void main(String[] args) {
		   System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 
		
		   WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bugzilla.org/download/");
		driver.findElement(By.xpath(".//*[@id='mainContent']/div[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id='mainContent']/div[3]/a")).click();
		
		
	}

}

