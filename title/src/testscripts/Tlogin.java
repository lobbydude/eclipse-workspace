package testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;





public class Tlogin {
	
	
//	static FirefoxDriver driver;
//	static WebDriverWait wait;
//	@BeforeTest
//	 public void TestSetup()
//	{
//		// Set the path of the Firefox driver.
//		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		
//		// Enter url.
//		driver.get("http://www.linkedin.com/");
//		driver.manage().window().maximize();
//		
//		wait = new WebDriverWait(driver,30);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
	
	@Test
	public void Leadtest()throws Exception{
		
		ArrayList a=new ArrayList();
		Keywords key=new Keywords();
		
		FileInputStream file=new FileInputStream("C:\\Users\\shivarajkumar\\eclipse-workspace\\title\\leadsuitee.xlsx");
		
		XSSFWorkbook b=new XSSFWorkbook(file);
		
		
	Sheet s =b.getSheet("testcases");
	Iterator itr=s.iterator();
	while(itr.hasNext()){
		Row rowitr=(Row)itr.next();
		Iterator cellitr=rowitr.cellIterator();
		while(cellitr.hasNext()){
			Cell celldata=(Cell)cellitr.next();
			switch(celldata.getCellType()){
			case Cell.CELL_TYPE_STRING:
				a.add(celldata.getStringCellValue());
				break;
			
				
			case Cell.CELL_TYPE_NUMERIC:
				a.add(celldata.getNumericCellValue());
				break;
				
			case Cell.CELL_TYPE_BOOLEAN:
				a.add(celldata.getBooleanCellValue());
				break;
				
			}
			
		}
	}
		
		for(int i=0;i<a.size();i++){
			
			if(a.get(i).equals("openbrowser")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
					key.openbrowser();
				
				
				
				}
				
			}
			
			if(a.get(i).equals("navigate")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
					key.navigate(data);
				
				
				
				}
				
			}
			if(a.get(i).equals("input")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
					key.input(data,objectname);
				
				
				
				}
				
			}
			
			
			
			if(a.get(i).equals("verifyTitle")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
				String actualvalue=key.VerifyTitle();
				AssertJUnit.assertEquals(data,actualvalue);
				
				
				}
}
			
			if(a.get(i).equals("verifyEditBox")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
				String actualvalue=key.VerifyEditBox(objectname);
				AssertJUnit.assertEquals(data,actualvalue);
				
				
				
				}
				
			}
			
			if(a.get(i).equals("click")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
					key.click(objectname);
				
				
				
				}
				
			}
			if(a.get(i).equals("alert1")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
					key.alert1(objectname);
				
				
				
				}
				
			}
			
			
			
}
	}
	
	

}

