package one12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Exceldatafetch.ExcelUtils;
import newone.DemoUtils;

public class DataProviderpart1 {

	@Test(dataProvider = "getdata", dataProviderClass =ExcelUtils.class )
	public void display(String data[]) throws InterruptedException {

	System.err.println(data[0]);
	System.err.println(data[1]);

		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\cdriver\\chromedriver-win64\\chromedriver.exe"); ChromeDriver driver=new
		  ChromeDriver(); driver.get("https://bsmartstaging.aanandas.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		  driver.findElement(By.id("email")).sendKeys(data[0]);
		  driver.findElement(By.id("password")).sendKeys(data[1]);
		  driver.findElement(By.xpath(
		  "//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/button")).
		  click();
		 

	}

}
