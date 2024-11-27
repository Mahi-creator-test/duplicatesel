package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sales_Page_Object {
	
	
	

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/main/div[2]/div[1]/div/div[3]/div[1]/div/div/div[1]/h4")
	public static WebElement salesmenu;

}
