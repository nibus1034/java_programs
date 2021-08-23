package com.sba.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.checking.ReadfromFile;


public class MainPage {
	
	public static void main(String[] args) {
	
	//	readFromExcel("Sheet1","Chrome");
//		ArrayList list2=new ArrayList();
//		list2.add("safari");
//		list2.add("merxury");
//		list2.add("mercury");
//	//	writeintoExcel("Sheet1", "Chrome",list2);
//		writeintoExistingExcel("Sheet1", "Chrome",list2);
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		
		
	}
	
	

public static List readFromExcel(String sheetNam,String rowHeader){
	ArrayList list=new ArrayList();
	try{		
		File file=new File("C:\\Users\\subin\\Desktop\\test.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		
		XSSFSheet sheetName=workbook.getSheet(sheetNam);
		
		//String rowHeader="Chrome";
		int rowCount=sheetName.getLastRowNum()-sheetName.getFirstRowNum();
		System.out.println("Details");
		for(int i=0;i<rowCount;i++){
			Row row=sheetName.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++){
				if(row.getCell(0).getStringCellValue().equalsIgnoreCase(rowHeader)){
					System.out.println(j);
				list.add(row.getCell(j).getStringCellValue());
				System.out.print(row.getCell(j).getStringCellValue()+ " ");
			}
		}
		}
		
		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	return list;
}

public static List writeintoExcel(String sheetNam,String rowHeader,List data){
	ArrayList list=new ArrayList();
	try{
		File file=new File("C:\\Users\\subin\\Desktop\\test.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		
		XSSFSheet sheetName=workbook.getSheet(sheetNam);
		
		//String rowHeader="Chrome";
		int rowCount=sheetName.getLastRowNum()-sheetName.getFirstRowNum();
		System.out.println("Details");
		
			Row row=sheetName.getRow(0);
			Row newRow=sheetName.createRow(rowCount+1);
					
			for(int j=0;j<row.getLastCellNum();j++){
				
				Cell cell=newRow.createCell(j);
				String value=(String) data.get(j);
				cell.setCellValue(value);
				
			}	
//				if(row.getCell(0).getStringCellValue().equalsIgnoreCase(rowHeader)){
//					System.out.println(j);
//				list.add(row.getCell(j).getStringCellValue());
//				System.out.print(row.getCell(j).getStringCellValue()+ " ");
			//}
		//}
			input.close();
			FileOutputStream outputStream=new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
	//	}
		
		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	return list;
}

public static List writeintoExistingExcel(String sheetNam,String rowHeader,List data){
	ArrayList list=new ArrayList();
	try{
		File file=new File("C:\\Users\\subin\\Desktop\\test.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		
		XSSFSheet sheetName=workbook.getSheet(sheetNam);
		
		//String rowHeader="Chrome";
		int rowCount=sheetName.getLastRowNum()-sheetName.getFirstRowNum();
		System.out.println("Details");
		
		
		for(int i=0;i<rowCount;i++){
			Row row=sheetName.getRow(i);
			//Row newRow=sheetName.createRow(rowCount+1);
					
			for(int j=0;j<row.getLastCellNum();j++){
	
				if(row.getCell(0).getStringCellValue().equalsIgnoreCase(rowHeader)){
					String value=(String) data.get(j);
					
					row.createCell(3).setCellValue(value);
					
					System.out.println(value);
		}
	}
		}
			input.close();
			FileOutputStream outputStream=new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
		
		
		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	return list;
}


}