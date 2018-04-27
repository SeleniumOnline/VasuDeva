package com.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting 
{
	public static void main(String[] args) throws Exception 
	{
		
		FunctionLibrary v=new FunctionLibrary();
		v.appLaunch("http://opensource.demo.orangehrmlive.com");
		v.appLogin("Admin", "admin");
		
       File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		//workbook object
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//worksheet object
		XSSFSheet ws=wb.getSheet("Sheet1");
		//rowscount
		int rowcount=ws.getLastRowNum();
		
		for (int i =1; i<=rowcount+1; i++) 
		{
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String lName=ws.getRow(i).getCell(1).getStringCellValue();
			
			String results=v.empAdd(fName, lName);
			
			ws.getRow(i).createCell(2).setCellValue(results);
						
			FileOutputStream fos=new FileOutputStream(src);
			
			wb.write(fos);
			
			
		}
		
		wb.close();
		
		//appLogout
		//appClose
		

	}

}
