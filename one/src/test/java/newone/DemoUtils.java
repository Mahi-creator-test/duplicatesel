package newone;

import org.testng.annotations.DataProvider;

import Utils.ReadExcel;

public class DemoUtils {
	

	@DataProvider(/*indices = {1,2}*/  parallel = true)
	public String[][] getdata() {
		
		String[][] ExcelData=ReadExcel.getExcelData();
		
		
		
//		String data[][]=new String[4][2];	
//		data[0][0]="Admin";
//		data[0][1]="Admin@123";
//		
//		
//		data[1][0]="Admin1";
//		data[1][1]="Admin@1231";
//		
//		
//		data[2][0]="Admin1eeeeeee";
//		data[2][1]="Admin@1231eeee";
//		
//		data[3][0]="Admin1eeeeeee";
//		data[3][1]="Admin@1231eeee";
		
		return ExcelData;
	}
	
	
	
	
	
	
	
	
	
	

}
