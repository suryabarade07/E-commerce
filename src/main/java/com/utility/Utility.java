package com.utility;


	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import com.base.BaseClass;

	public class Utility extends BaseClass {
		public static void Implicitlywait()
		 {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			  
		 }
		public static XSSFSheet getsheet(String sheetname) throws IOException
		{
			FileInputStream fis = new FileInputStream(projectpath+"C:\\Users\\HP\\Documents.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			return sheet;
		}
		
		public static Object getSingleData(int rownum, int cellnum, XSSFSheet sheet)
		{
		     if(sheet.getRow(rownum).getCell(cellnum).getCellType().toString().equalsIgnoreCase("string"))
		     {
		      sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		      
		     }
		     else {
		    	 sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
		     }
		     return sheet;
		}
	}
	
	


