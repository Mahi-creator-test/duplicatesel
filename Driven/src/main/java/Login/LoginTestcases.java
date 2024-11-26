package Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExcelData.Excelcode;

public class LoginTestcases {
	
////	
////	String data[][] ={
////		{"Admin1","admin"},
////		{"Admin1","dummy"},
////		{"Admin","admin"},
////		{"Admin","admin1"}
////		
////		
////		
////	};
////	
////	
////	
////	
////	
////	@DataProvider(name = "Logindata" )
////	public String[][] Logindataprovide() {
////		
////		
////		
////		return data;
//		
//		
//		
//		
//	}
	
	
	public class utils {
		
		@DataProvider(name="Logindata")
		public String[][] data() throws IOException{
			
			String[][] exceldata=Excelcode.getExceldata();
			
			
			
			
			return exceldata;
		}
	
	
	 @Test(dataProvider = "Logindata")
	 public void correctup(String user,String pass) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("submitBTN")).click();
		
		
		
	}

}}
