package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfile1 {

	
	public static void main(String[] args) throws IOException {	
		//Instantiation of driver object. To launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		//To open URL "http://softwaretestingmaterial.com"
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		//To click on the 'browse' button
		browse.click();
		//To call the AutoIt script
		Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\Uploadfile.exe");
		//'close' method is used to close the browser window
		driver.close();
	}
}
