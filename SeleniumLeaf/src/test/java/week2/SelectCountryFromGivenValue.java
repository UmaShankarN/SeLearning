package week2;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectCountryFromGivenValue 
{

	public static void main(String[] args) 
	{
		//Getting input from user for Starting Letter and which value to pick
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the Starting Letter and the value to pick:");
		String startLetter=in.next();
		int position = in.nextInt();
		
		//Setting Chrome browser property 
		System.setProperty("webdriver.chrome.driver", "F:/New/Softwares/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Opening IRCTC Signup page	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("Sign up").click();
		
		//Getting list of options from dropdown		
		WebElement dropDown= driver.findElementById("userRegistrationForm:countries");
		Select fromDropDown=new Select(dropDown);
		List<WebElement> valuesFromDropDown =fromDropDown.getOptions();
		int counter=0;		
		for(int i=1;i<=valuesFromDropDown.size();i++)
		{
			//if loop to match country name starting with given option
			if(valuesFromDropDown.get(i).getText().startsWith(startLetter))
			{
				counter++; //Counter gets incremented each time when it finds the start with letter "E"
				if(counter==position) //if loop runs till the counter value matches with position given
				{
				System.out.println("The Country that starts with letter "+startLetter+ " and at the given position " +position+ " is: "+ valuesFromDropDown.get(i).getText());
				break;
				}
			}
			
		}
	}
}