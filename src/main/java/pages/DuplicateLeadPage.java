package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
		reportStep("This is not Duplicate Lead Page", "FAIL");
		}
	}
	
	public DuplicateLeadPage verifyDuplicateLeadTitle()
	{
		verifyTextById("sectionHeaderTitle_leads", "Duplicate Lead");
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		clickByName("submitButton");
		return new ViewLeadPage(driver, test);
	}
	
}
