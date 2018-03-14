package testscript;



import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;


public class ExcuteLeadTest{
	//public static void main(String[] args)throws Exception {
	@Test
	public void Leadtest()throws Exception{
		
		ArrayList a=new ArrayList();
		keywords key=new keywords();
		
		FileInputStream file=new FileInputStream("D://leadsuitee.xlsx");
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
				Assert.assertEquals(data,actualvalue);
				
				
				
				}
				
			}
			
			if(a.get(i).equals("verifypageText")){

				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes")){
					
				String actualvalue=key.VerifypageText(objectname);
				Assert.assertEquals(data,actualvalue);
				
				
				
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
				Assert.assertEquals(data,actualvalue);
				
				
				
				}
				
			}
	}
		
		
	}
	}
}
