package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_EditLead extends LeafTapsWrappers{
	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC005_EditLead";
		testDescription = "Edit Lead";
		category = "Smoke";
		authors = "";
		browserName = "chrome";
		dataSheetName = "TC005";
		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String Fname, String CName) {
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeadsLink()
		.enterFirstName(Fname)
		.clickFindLeadButton()
		.clickFirstResultingLead()
		.clickEditbutton()
		.changeCompanyName(CName)
		.clickUpdateButton()
		.verifyCompanyName(CName);
		
		
		
		
		
	}

}
