package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		String attributeValue = driver.findElement(By.name("nameSelenium")).getAttribute("value");
		System.out.println("Available attribute value is :"+attributeValue);
		
	}

}
