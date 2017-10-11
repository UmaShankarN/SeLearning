package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}
		
		public ViewLeadPage verifyFirstName(String verifyFName)
		{
			verifyTextById("viewLead_firstName_sp", verifyFName);
			return this;
		}
		
		public DuplicateLeadPage clickDuplicateLead()
		{
			clickByLink("Duplicate Lead");
			return new DuplicateLeadPage(driver, test);
		}
		
		public EditLeadPage clickEditbutton()
		{
			clickByLink("Edit");
			return new EditLeadPage(driver, test);
		}
		
		public ViewLeadPage verifyCompanyName(String CName)
		{
			verifyTextContainsById("viewLead_companyName_sp", CName);
			return this;
		}
		
		public FindLeadPage clickFindLeadsLinkFromViewLeadsPage()
		{
			clickByLink("Find Leads");
			return new FindLeadPage(driver, test);
		}
		
		public MyLeadsPage deleteLead()
		{
			clickByLink("Delete");
			return new MyLeadsPage(driver, test);
		}
		
		public void verifyduplicatedFirstName()
		{
			verifyTextContainsById("viewLead_firstName_sp", firstResultleadName);
		}
	}




