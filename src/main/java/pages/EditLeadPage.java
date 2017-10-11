package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}
	}

	
	public EditLeadPage changeCompanyName(String CName)
	{
		enterById("updateLeadForm_companyName", CName);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton()
	{
		clickByXpath("(//input[@type='submit'])[1]");
		return new ViewLeadPage(driver, test);
	}
	
}
