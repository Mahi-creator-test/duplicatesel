package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page_objects {
	
	
	
	
	 @FindBy(id ="email")
	  public static WebElement username;
	  
	  @FindBy(how = How.ID ,using = "password")
	  public static WebElement Pass;
	  
	  
	  @FindBy(xpath = "//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/button/p")
	  public static WebElement submit;

}
