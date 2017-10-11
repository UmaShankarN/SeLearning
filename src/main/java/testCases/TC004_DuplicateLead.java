package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DuplicateLead extends LeafTapsWrappers
{

	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC004_DuplicateLead";
		testDescription = "Create Duplicate Lead";
		category = "Smoke";
		authors = "";
		browserName = "chrome";
		dataSheetName = "TC004";
		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String eMail){
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeadsLink()
		.clickEmailTab()
		.enterEmailAddress(eMail)
		.clickFindLeadButton()
		.captureFirstResultingLeadName()
		.clickFirstResultingLead()
		.clickDuplicateLead()
		.verifyDuplicateLeadTitle()
		.clickCreateLead()
		.verifyduplicatedFirstName();
	
		//.verifyLoginName(LgdUser)
		//.clickLogOut();
	}
}

