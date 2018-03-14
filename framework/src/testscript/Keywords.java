package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keywords {
	
static FirefoxDriver driver;
static FileInputStream file;
static Properties prop;
public void openbrowser()throws Exception{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	file =new FileInputStream("C:\\JavaWorkspace\\CrmFrameWorkk\\src\\objectrepository\\objectrepository.properties");
prop=new Properties();
prop.load(file);


}
public void navigate(String data){
	driver.get(data);
}
public void input(String data,String objectname){
	driver.findElement(By.xpath (prop.getProperty(objectname))).sendKeys(data);
}

public void click(String objectname){
	driver.findElement(By.xpath(prop.getProperty(objectname))).click();
}
public String VerifyTitle(){
	String actualvalue=driver.getTitle();
	return actualvalue;
}
public String VerifypageText(String objectname)
{
	String actualvalue=driver.findElement(By.xpath(prop.getProperty(objectname))).getText();
	return actualvalue;
}
public String VerifyEditBox(String objectname)
{
	String actualvalue=driver.findElement(By.xpath(prop.getProperty(objectname))).getAttribute("value");
	return actualvalue;
}
}
