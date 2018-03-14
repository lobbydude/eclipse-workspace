import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 
		 FirefoxDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\softwares\\Selenium prjct\\Framework\\ObjectRepositary.properties");
	Properties prop = new Properties();
	prop.load(file);

  }
}
