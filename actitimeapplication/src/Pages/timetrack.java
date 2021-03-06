package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.webactionutil;

public class timetrack extends Basepage
{
	@FindBy(id="container_tt")
	private WebElement timeTrack;
	
	@FindBy(id="addTaskButtonId")
	private WebElement newButton;
	
	@FindBy(xpath="//tr[@class='selectCustomerRow']//div[@class='comboboxButton']//div[@class='dropdownButton']")
	private WebElement selectCustomerAndProjectToAddTasksDropDown;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//input[@placeholder='not needed']")
	private WebElement estimateHours;
	
	@FindBy(id="ext-gen72")
	private WebElement setDeadlineDate;
	
	@FindBy(className="x-date-right")
	private WebElement calenderBoxRightArrowButton;
	
	@FindBy(className="components_button withPlusIcon")
	private WebElement createTasks;
	
	@FindBy(xpath="//span[.='AkshataS']")
	private WebElement name;
	
	@FindBy(xpath="//span[.='AkshataS']/../../../../../..//div[@class='taskButton removeTaskButton']")
	private WebElement hideRowLink;
	
	@FindBy(xpath="//input[@id='SubmitTTButton']/..//span[contains(@class,'cancelButton')]")
	private WebElement cancelButton;
	
	@FindBy(id="SubmitTTButton")
	private WebElement saveChangesButton;
	
	public TimeTrackPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}


	public void clickOnTimeTrack()
	{
		webActionUtil.clickOnElement(timeTrack);
	}
	
	public void clickOnNewButton()
	{
		webActionUtil.clickOnElement(newButton);
	}
	
	public void clickOnSelectCustomerAndProjectToAddTasksDropDown(String text)
	{
		webActionUtil.selectDropDownText(selectCustomerAndProjectToAddTasksDropDown, text);
	}
	
	public void clickOnEnterCustomerName(String customerName)
	{
		webActionUtil.enterKeys(enterCustomerName, customerName);
	}
	
	public void clickOnEnterProjectName(String projectName)
	{
		webActionUtil.enterKeys(enterProjectName, projectName);
	}
	
	public void clickOnEnterTaskName(String taskName)
	{
		webActionUtil.enterKeys(enterTaskName, taskName);
	}
	
	public void clickOnEstimateHours(String hours)
	{
		webActionUtil.enterKeys(estimateHours, hours);
	}
	
	public void clickOnSetDeadlineDate()
	{
		webActionUtil.clickOnElement(setDeadlineDate);
	}
	
	public void clickOnCalenderBoxRightArrowButton(String month, String day)
	{
		webActionUtil.clickOnElement(calenderBoxRightArrowButton);
		calenderBoxRightArrowButton.click();
		WebElement months = driver.findElement(By.xpath("//button[.='" + month + "']"));
		months.findElement(By.xpath("//span[.='" + day + "']"));
	}
	
	public void clickOnCreateTasks()
	{
		webActionUtil.clickOnElement(createTasks);
	}
}

