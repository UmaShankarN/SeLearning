package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ApplicationLogin extends GenericWrappers
{
	
	@BeforeMethod(groups={"smoke"})
	@Parameters({"browserName","URL","userName","password"})
 public void applicationLogin(String browser,String url,String uName,String Password)
 {
	 	invokeApp(browser,url);
		enterById("username", uName);
		enterById("password",Password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
 }
	
	
	@AfterMethod(groups={"smoke"})
	
	public void closeBrowsers()
	{
		closeBrowser();
	}
	
}
