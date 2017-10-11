package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPopUpWindow extends LeafTapsWrappers
{
	public FindLeadsPopUpWindow(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test=test;
		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Leads Pop up Window", "FAIL");
	}
	}
	
	public FindLeadsPopUpWindow enterFromLeadID(String Fromleadid)
	{
		enterByName("id", Fromleadid);
		return this;
	}
	
	public FindLeadsPopUpWindow enterToLeadID(String Toleadid)
	{
		enterByName("id", Toleadid);
		return this;
	}
	public FindLeadsPopUpWindow clickFindLeadsButton()
	{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public FindLeadsPopUpWindow clickFirstResultingLeadId()
	{
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return this;
	}
	
	public MergeLeadPage switchToMergeLeadsWindow()
	{
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
	
}



