package TestCases;

import org.testng.annotations.Test;
import Pages.timetrack;

public class TC001 extends BaseTest
{
	@Test
	public void enterTimeTrack()
	{
		timetrack timeTrackPage = new timetrack(driver, webActionUtil);
		
		timeTrackPage.clickOnSelectCustomerAndProjectToAddTasksDropDown("- New Customer -");
		timeTrackPage.clickOnEnterCustomerName("Meena");
		timeTrackPage.clickOnEnterProjectName("Actitime");
		timeTrackPage.clickOnEnterTaskName("Automate 100 Test Cases");
		timeTrackPage.clickOnEstimateHours("5");
		timeTrackPage.clickOnCalenderBoxRightArrowButton("August 2020", "3");
	
	}
}

