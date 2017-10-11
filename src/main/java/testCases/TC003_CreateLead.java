package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers
{

	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC003_CreateLead";
		testDescription = "Create New Lead";
		category = "Smoke";
		authors = "";
		browserName = "chrome";
		dataSheetName = "TC003";
		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String cName, String fName, String lName, String verifyFName){
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.verifyFirstName(verifyFName);
		//.verifyLoginName(LgdUser)
		//.clickLogOut();
	}
}

