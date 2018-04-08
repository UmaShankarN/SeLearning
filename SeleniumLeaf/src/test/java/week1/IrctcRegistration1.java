package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRegistration1 {

	public static void main(String[] args) 
	{
		//SetProperty for the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("kriramram9");
		driver.findElementById("userRegistrationForm:checkavail").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Mypassword123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Mypassword123");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Tommy");
		//driver.findElementByXPath("//select[@id='userRegistrationForm:prelan']/option[@value='hi']").click();
		driver.findElementByXPath("//option[text()='हिन्दी']").click();
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Krishna");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("K");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Ram");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("25");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("FEB");//try with lower case
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1991");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Others");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789");
		driver.findElementById("userRegistrationForm:idno").sendKeys("123456789");
		driver.findElementById("userRegistrationForm:email").sendKeys("rajaram@cogmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("Northern Mariana Islands");
		driver.findElementById("userRegistrationForm:address").sendKeys("25");
		driver.findElementById("userRegistrationForm:street").sendKeys("1st Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Chennai");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		
		

	}

}
