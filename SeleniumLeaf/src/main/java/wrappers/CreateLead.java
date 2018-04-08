package wrappers;

import org.testng.annotations.Test;
//@Test(dataProvider="fetchData", invocationCount=2, invocationTimeOut=120000)
public class CreateLead extends ApplicationLogin
{
	//@Test(dependsOnMethods={"wrappers.EditLead.editLead"})
	//@Test(dataProvider="fetchData",invocationCount=2)	
	//@Test(dataProvider="fetchData", dataProviderClass=week5.DataProviderClass.class)
	@Test(invocationCount=2, threadPoolSize=2)
	//public void TestClass(String fName,String lName,String cName) throws InterruptedException
	public void TestClass() throws InterruptedException
	{
		
		clickByLink("Create Lead");		
		enterById("createLeadForm_companyName", "hari");
		enterById("createLeadForm_firstName", "doss");
		enterById("createLeadForm_lastName", "CTS");
		//enterByName("parentPartyId", "Shankar");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");
		selectIndexByName("marketingCampaignId",1);
		enterById("createLeadForm_firstNameLocal", "hari Doss");
		enterById("createLeadForm_lastNameLocal", "N");
		enterById("createLeadForm_personalTitle", "Dear");
		enterById("createLeadForm_generalProfTitle", "Mister");
		enterById("createLeadForm_departmentName", "Forest");
		enterById("createLeadForm_annualRevenue", "2lacs");
		selectValueById("createLeadForm_currencyUomId", "INR");
		selectVisibileTextById("createLeadForm_industryEnumId", "Retail");
		enterById("createLeadForm_numberEmployees", "1000");
		selectValueById("createLeadForm_ownershipEnumId", "OWN_CCORP");
		enterById("createLeadForm_sicCode", "2564889");
		enterById("createLeadForm_tickerSymbol", "$");
		enterById("createLeadForm_description", "Autonomous");
		enterById("createLeadForm_importantNote", "No Comments");
		enterById("createLeadForm_primaryPhoneCountryCode", "91");
		enterById("createLeadForm_primaryPhoneAreaCode", "044");
		enterById("createLeadForm_primaryPhoneNumber", "123456789");
		enterById("createLeadForm_primaryPhoneExtension", "044");
		enterById("createLeadForm_primaryPhoneAskForName", "Wife");
		enterById("createLeadForm_primaryEmail", "hotej@mail.com");
		enterById("createLeadForm_primaryWebUrl", "http://leaftaps.com/opentaps");
		enterByName("generalToName", "Ram");
		enterByName("generalAttnName", "Hari");
		enterByXpath("//input[@name='generalAddress1']", "Apartment H");
		enterByXpath("//input[@name='generalAddress2']", "40 Waukegun road");
		enterById("createLeadForm_generalCity", "bannockburn");
		selectValueById("createLeadForm_generalStateProvinceGeoId", "GA");
		enterById("createLeadForm_generalPostalCode", "601301");
		selectValueById("createLeadForm_generalCountryGeoId", "IND");
		enterById("createLeadForm_generalPostalCodeExt", "91");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_firstNameLocal_sp", "hari DOSS");
		
			
		}
		
//	@DataProvider(name="fetchData")
//public  Object[][] getData(){
//		
//		Object[][] data = new Object[1][3];
//		
//		data[0][0]="Uma";
//		data[0][1]="S";
//		data[0][2]="CTS";
////		data[1][0]="Uma1";
////		data[1][1]="Shankar";
////		data[1][2]="CTS T";
//		return data;
//		
//		
//	
//}
	}


