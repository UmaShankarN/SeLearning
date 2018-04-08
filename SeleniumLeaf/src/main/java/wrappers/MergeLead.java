package wrappers;

import org.junit.Test;

public class MergeLead extends ApplicationLogin
{
	
	@Test
    public void mergeLead() throws InterruptedException
    {
		
	
	clickByLink("Leads");
	clickByLink("Merge Leads");
	clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
	
	switchToLastWindow();
	enterByName("id", "10235");
	clickByXpath("//button[contains(text(),'Find Leads')]");
	/*with snap it is not moving to target window(No Such window exception), because in the following method 
	 the window is getting closed before the screenshot is taken*/	
	clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	
	switchToParentWindow();
	
	clickByXpath("(//img[@alt='Lookup'])[2]");
	switchToLastWindow();
	enterByName("id", "10236");
	clickByXpath("//button[contains(text(),'Find Leads')]");
	//Thread.sleep(3000);
	/*with snap it is not moving to target window(No Such window exception), because in the following method 
	 the window is getting closed before the screenshot is taken*/	
	clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	
	switchToParentWindow();
	//Thread.sleep(5000);
	/*with snap it is not accepting alert {No Such alert exception)
	When an alert is present you cannot do activity on the webpage except to switch to the alert and do any of the below  
	accept/dismiss/getText/send keys. Either you need to accept or dismiss the alert before you do anything 
	on the webpage..*/
	clickByLinkNoSnap("Merge");
	acceptAlert();
	clickByLink("Find Leads");
	enterByName("id", "10235");
	clickByXpath("//button[contains(text(),'Find Leads')]");
	verifyTextByXpath("//div[text()='No records to display']","No records to display");
	
	}
}
