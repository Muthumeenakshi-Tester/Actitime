package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.webactionutil;


public class Homepage extends Basepage
{
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	
	public HomePage(WebDriver driver, webactionutil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void clickLogout()
	{
		webActionUtil.clickOnElement(logoutButton);
	}
	
	
}



