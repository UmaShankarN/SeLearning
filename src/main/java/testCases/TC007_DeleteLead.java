package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_DeleteLead extends LeafTapsWrappers{
	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC007_DeleteLead";
		testDescription = "Delete Leads";
		category = "Smoke";
		authors = "";
		browserName = "chrome";
		dataSheetName = "TC007";
		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String Phone) {
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneNumber(Phone)
		.clickFindLeadButton()
		.captureFirstResultingLeadId()
		.clickFirstResultingLeadNoSnap()
		.deleteLead()
		.clickFindLeadsLink()
		.enterCapturedLeadId()
		.clickFindLeadButton()
		.verifyErrorMessage();
		
		
		
		
	}

}
