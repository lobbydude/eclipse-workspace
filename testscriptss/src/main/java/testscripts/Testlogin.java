package testscripts;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Testlogin {
	
		//public static void main(String[] args)throws Exception {
			@Test
			public void Leadtest()throws Exception{
				
				ArrayList a=new ArrayList();
				Keywords key=new Keywords();
				
				FileInputStream file=new FileInputStream("C:\\softwares\\Selenium prjct\\Framework\\leadsuitee.xlsx");
				
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
			}
	}
			
			}
}