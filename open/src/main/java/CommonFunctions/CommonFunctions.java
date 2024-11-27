package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	
	public static WebDriver driver=null;
	
	 public static Properties prop =null;
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		prop=new Properties();
		prop.load(fileInputStream);
		
		return prop;
		
		
		
	}
	
	@BeforeSuite
	public void LaunchBrowser() throws IOException {
		
		
		
		loadPropertyFile();
		
		String browser=prop.getProperty("Browser");
		String url=prop.getProperty("url");
		String driverlocation=prop.getProperty("driverlocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverlocation);
			
			driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

			
		}else if(browser.equalsIgnoreCase("Firefox"))
			

			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
			
			
		}
		
		
		
	
	
	@AfterSuite
	public void teakbreak() {
		
		
		
		
		
		
		
		
	}

}
