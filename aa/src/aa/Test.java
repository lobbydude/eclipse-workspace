package aa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	// static FirefoxDriver driver;

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver.exe");
	
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=w5eiWtvjDtHD8Ae1lILIDw");
	
	
	
	driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("data");
	//driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Software Testing Material Website");
	}
	
}