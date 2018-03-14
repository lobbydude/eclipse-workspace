package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath("xpath")).sendKeys("Software Testing Material Website");
	
}
}
