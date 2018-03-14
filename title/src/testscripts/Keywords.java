package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class Keywords {

	static ChromeDriver driver;
	static FileInputStream file;
	static Properties prop;
	//static RemoteWebDriver webDriver;
	//static WebElement element;
	

	public void openbrowser() throws UnhandledAlertException, IOException, NullPointerException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 
		 System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 
         System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\temp\\logs.txt");
		driver=new ChromeDriver();
		
		 //driver=new FirefoxDriver();
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//		 
//		 try 
//		 {
//		 Thread.sleep(500);
//		 } 
//		 catch (InterruptedException e) {
//		  
//		 System.out.println(e.getMessage());
//		 } 
//		  
//		 js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
//		  
		 
		 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		file =new FileInputStream("C:\\Users\\shivarajkumar\\eclipse-workspace\\title\\src\\Object.properties");
		prop=new Properties();
		prop.load(file);
//		try {
//	        Set<String> windows = webDriver.getWindowHandles();
//	        Iterator<String> iter = windows.iterator();
//	        String[] winNames=new String[windows.size()];
//	        int i=0;
//	        while (iter.hasNext()) {
//	            winNames[i]=iter.next();
//	            i++;
//	        }
//
//	        if(winNames.length > 1) {
//	            for(i = winNames.length; i > 1; i--) {
//	                webDriver.switchTo().window(winNames[i - 1]);
//	                webDriver.close();
//	            }
//	        }
//	        webDriver.switchTo().window(winNames[0]);
//	    }
//	    catch(Exception e){         
//	        e.printStackTrace();
//	    }
//		
		
	}
//	public static void switchTab() {            
//	    try {
//	        Set<String> windows = webDriver.getWindowHandles();
//	        Iterator<String> iter = windows.iterator();
//	        String[] winNames=new String[windows.size()];
//	        int i=0;
//	        while (iter.hasNext()) {
//	            winNames[i]=iter.next();
//	            i++;
//	        }
//
//	        if(winNames.length > 1) {
//	            for(i = winNames.length; i > 1; i--) {
//	                webDriver.switchTo().window(winNames[i - 1]);
//	                webDriver.close();
//	            }
//	        }
//	        webDriver.switchTo().window(winNames[0]);
//	    }
//	    catch(Exception e){         
//	        e.printStackTrace();
//	    }
//	}

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

	public void alert1(String objectname) {
		
		
		// TODO Auto-generated method stub
		//Alert alert = driver.switchTo().alert();
//		alert.accept(); 
		//driver.switchTo().alert().accept();
		String MainWindow=driver.getWindowHandle();
		driver.switchTo().window(MainWindow);
		System.out.println("popup handled");
		
	}
	

//	public String VerifypageText(String objectname) {
//		// TODO Auto-generated method stub
//		String actualvalue=driver.findElement(By.xpath(prop.getProperty(objectname))).getAttribute("value");
//		return actualvalue;
//
//	}

	

	
}
