package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import library.webactionutil;

public class Basepage
{
	public WebDriver driver;
	public webactionutil webActionUtil;
	
	public Basepage(WebDriver driver, webactionutil webActionUtil)
	{
		this.driver=driver;
		this.webActionUtil=webActionUtil;
		PageFactory.initElements(driver, this);
	}
}
