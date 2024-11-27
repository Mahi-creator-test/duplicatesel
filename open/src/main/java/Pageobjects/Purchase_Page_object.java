package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchase_Page_object {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div[3]/div[1]/div[3]/div/div/div[2]/span")
	public static WebElement purchasemenu;

}
