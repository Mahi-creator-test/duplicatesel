package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] getExcelData()  {
		
		
		String Filelocation="./Test_data/Login.xlsx";
		XSSFWorkbook WB = null;
		try {
			WB = new XSSFWorkbook(Filelocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=WB.getSheetAt(0);
		int Lastrownum=sheet.getLastRowNum();
		
		int Allrows=sheet.getPhysicalNumberOfRows();
		System.out.println("All rows in  sheet : " +Allrows);
		
		System.out.println("Last Row Number :  "+Lastrownum);
		
		short Lastcellnumber=sheet.getRow(0).getLastCellNum();
		System.out.println("My Last Cell Number : " +Lastcellnumber);
		//row number cell number 
		String data[][]=new String[Lastrownum][Lastcellnumber];
		for (int i = 1; i <= Lastrownum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < Lastcellnumber; j++) {
				XSSFCell cell = row.getCell(j);
				
				DataFormatter dft=new DataFormatter();
				String valuesincell=dft.formatCellValue(cell);
				System.out.println(valuesincell);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i-1][j] = valuesincell;
			}
		}
		try {
			WB.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
		
	}
	

}
