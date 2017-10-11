package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {
	
	public FindLeadPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")){
		reportStep("This is not Find Lead Page", "FAIL");
		}
	}
		
	public FindLeadPage clickEmailTab()
		{
		clickByXpath("//span[contains(.,'Email')]");
		return this;
		}
		
	public FindLeadPage  enterEmailAddress(String eMail)
		{
			enterByName("emailAddress", eMail);
			return this;
		}
	
	public FindLeadPage clickFindLeadButton()
		{
		 	clickByXpath("//button[text()='Find Leads']");
		 	return this;
		}	
	
	public FindLeadPage captureFirstResultingLeadName()
	{
		firstResultleadName = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		return this;
	}
	
	public FindLeadPage captureFirstResultingLeadId()
	{
		
		firstResultleadID = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		//return firstResultleadID;
		//System.out.println(firstResultleadID);
		return this;
	}
	//
	public ViewLeadPage clickFirstResultingLead()
	{
		
		//clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		//clickByXpath("(//span[text()='Lead List']/following::div/following::table/tbody/tr/td/div/a)[1]");
		//clickByLink("10371");
		return new ViewLeadPage(driver, test);
	}
	
	public FindLeadPage enterFirstName(String Fname){
		enterByXpath("(//div[starts-with(@class,'x-form-element')])[19]/input[@type='text']", Fname);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLeadNoSnap()
	{
		
		//clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpathNoSnap("(//span[text()='Lead List']/following::div/following::table/tbody/tr/td/div/a)[1]");
		//clickByLink("10371");
		return new ViewLeadPage(driver, test);
	}
	
	public FindLeadPage enterLeadId(String Leadid){
		enterByName("id", Leadid);
		return this;
	}
	
	public void verifyErrorMessage(){
	verifyTextContainsByXpath("//div[text()='No records to display']", "No records to display");
	}	
	
	public FindLeadPage clickPhoneTab(){
		clickByXpath("//span[text()='Phone']");
		return this;
	}
	
	public FindLeadPage enterPhoneNumber(String Phone){
			enterByName("phoneNumber", Phone);
		return this;
		}
	
	public FindLeadPage enterCapturedLeadId()
	{
		enterByXpath("//input[@name='id']", firstResultleadID);
		return this;
	}
}



