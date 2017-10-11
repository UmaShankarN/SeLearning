package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {

	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) 
	{
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Leads Page", "FAIL");
	}	
		}
	
	public MergeLeadPage clickIconNearFromLead()
	{
		clickByXpath("(//img[@alt='Lookup'])[1]");
		return this;
	}

	public FindLeadsPopUpWindow switchToFindLeadsPopUpWindow()
	{
		switchToLastWindow();
		return new FindLeadsPopUpWindow(driver, test);
	}
	
	public MergeLeadPage clickIconNearToLead()
	{
		clickByXpath("(//img[@alt='Lookup'])[2]");
		return this;
	}
	
	public MergeLeadPage clickMergeButton()
	{
		clickByLinkNoSnap("Merge");
		return this;
	}
	
	public ViewLeadPage acceptOpenedAlert()
	{
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
}
