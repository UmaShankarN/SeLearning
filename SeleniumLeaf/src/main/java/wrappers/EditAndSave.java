package wrappers;

import org.testng.annotations.Test;

public class EditAndSave extends ApplicationLogin
{
	@Test
	public void editAndSave(){
	
	clickByLink("Accounts");
	clickByLink("Find Accounts");
	enterByXpath("//input[@name='id']", "10792");
	enterByXpath("(//input[@name='accountName'])[2]", "Anna");
	clickByXpath("//button[text()='Find Accounts']");
	clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	verifyTextById("sectionHeaderTitle_accounts", "Account Details");
	clickByLink("Edit");
	String accountName = "Anna1";
	enterById("accountName", accountName);
	clickByXpath("//input[@value='Save']");
	verifyTextContainsByXpath("(//span[@class='tabletext'])[3]", accountName);
	
}
	
}
