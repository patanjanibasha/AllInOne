package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test9_ReadDataFromXLfile {

	
	public void readData() throws IOException
	{
		//1. Location of File 
		File file =new File("./data.xlsx");
		System.out.println("file :"+file);
		
		//2. Create the connection 
		FileInputStream fis=new FileInputStream(file);
		System.out.println("fis :"+fis);
		
		//3. Type of file 
		Workbook wb=WorkbookFactory.create(fis);
		System.out.println("wb :"+wb.getAllNames());
		
		//4. get the sheet
		Sheet sheet=wb.getSheetAt(0);
		System.out.println("sheet  :"+sheet.getSheetName());
		
		//5. get the row
		 Row row=sheet.getRow(0);
		 System.out.println("row  :"+row.getLastCellNum());
		 
		//6. get the data from col
		 Cell cell=    row.getCell(1);
		 
		 System.out.println(cell);
	}
	
	@Test
	public void readFullExcelFile() throws IOException 
	{
		File file=new File("C:\\Users\\Janibasha\\Downloads\\logindata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		
		//1 get the sheet
		  Sheet sheet= wb.getSheetAt(0);
		  //rows and col
		   
		int tRows= sheet.getLastRowNum();
		for(int i=0;i<tRows;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j));
			}
		}      
	}
}
