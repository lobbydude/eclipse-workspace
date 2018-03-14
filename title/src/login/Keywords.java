package login;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Keywords {

	static FirefoxDriver driver;
	static FileInputStream file;
	static Properties prop;

	public void openbrowser() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 
		 driver=new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		file =new FileInputStream("C:\\Users\\shivarajkumar\\eclipse-workspace\\title\\src\\Object.properties");
		prop=new Properties();
		prop.load(file);
		
		
	}

	public void navigate(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
		
	}

	public void input(String data, String objectname) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath (prop.getProperty(objectname))).sendKeys(data);
	}

	public void click(String objectname) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
		
	}

	public String VerifyTitle() {
		// TODO Auto-generated method stub
		
		
		String actualvalue=driver.getTitle();
		return actualvalue;
	}

	

	public String VerifyEditBox(String objectname) {
		// TODO Auto-generated method stub
		String actualvalue=driver.findElement(By.xpath(prop.getProperty(objectname))).getAttribute("value");
		return actualvalue;
	}
//	
//	

//	public String VerifypageText(String objectname) {
//		// TODO Auto-generated method stub
//		String actualvalue=driver.findElement(By.xpath(prop.getProperty(objectname))).getAttribute("value");
//		return actualvalue;
//
//	}

	

	
}
