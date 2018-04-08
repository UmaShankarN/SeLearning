package week2;

import org.openqa.selenium.chrome.ChromeDriver;
public class PrintAllFromDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:/New/Softwares/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("Sign up").click();
		System.out.println(driver.findElementById("userRegistrationForm:securityQ").getText());
	}

}
