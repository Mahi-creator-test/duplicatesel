package ExcelData;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {

	public static String[][] getExceldata() throws IOException {
		// TODO Auto-generated method stub
		
		
		      String Filelocation="./Test_data/Login Excel.xlsx";
		      XSSFWorkbook WB=new XSSFWorkbook(Filelocation);
		      XSSFSheet sheet=WB.getSheetAt(0);
		      int Lastrownumber =sheet.getLastRowNum();
		      System.out.println(Lastrownumber);
		     short lastcellnumber =sheet.getRow(0).getLastCellNum();
		     System.out.println(lastcellnumber);
		     String data[][]= new String[Lastrownumber][lastcellnumber];
		     
		      for (int i = 1; i <= Lastrownumber; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < lastcellnumber; j++) {
					XSSFCell cell = row.getCell(j);
					DataFormatter dft=new DataFormatter();
					String value=dft.formatCellValue(cell);
					//String value = cell.getStringCellValue();
					//System.out.println(value);
					data[i-1][j]=value;
				} 
			}
		      WB.close();
		      return data;

	}

}
