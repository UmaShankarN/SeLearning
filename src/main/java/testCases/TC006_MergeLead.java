package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_MergeLead extends LeafTapsWrappers{
	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC006_MergeLead";
		testDescription = "Merge Two Leads";
		category = "Smoke";
		authors = "";
		browserName = "chrome";
		dataSheetName = "TC006";
		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String Fromleadid, String Toleadid,  String Leadid) {
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLeadsLink()
		.clickIconNearFromLead()
		.switchToFindLeadsPopUpWindow()
		.enterFromLeadID(Fromleadid)
		.clickFindLeadsButton()
		.clickFirstResultingLeadId()
		.switchToMergeLeadsWindow()
		.clickIconNearToLead()
		.switchToFindLeadsPopUpWindow()
		.enterToLeadID(Toleadid)
		.clickFindLeadsButton()
		.clickFirstResultingLeadId()
		.switchToMergeLeadsWindow()
		.clickMergeButton()
		.acceptOpenedAlert()
		.clickFindLeadsLinkFromViewLeadsPage()
		.enterLeadId(Leadid)
		.clickFindLeadButton()
		.verifyErrorMessage();
		
	}

}
