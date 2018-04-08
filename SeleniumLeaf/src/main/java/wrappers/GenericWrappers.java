package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	int i = 1;
	String parentWindow;
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();	
			} else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "F:/New/Softwares/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer32.exe");
				driver = new InternetExplorerDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			} catch (WebDriverException e) {
			 System.err.println("The Browser is unreachable");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();  
			driver.findElementById(idValue).sendKeys(data);
			System.out.println(data+" is entered successfully");
			} catch (NoSuchElementException e) {
			System.err.println("Element "+idValue+" is not accessable");
		} catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			} catch (NoSuchElementException e) {
			System.err.println("Element "+nameValue+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}

	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			} catch (NoSuchElementException e) {
			System.err.println("Element "+xpathValue+" is not accessable");
			
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}
	}
// public String getTitle()
// {
//	String pageTitle= driver.getTitle();
//	return pageTitle;
//	 
// }
	
	public boolean verifyTitle(String title) {
		String pageTitle= driver.getTitle();
		if(title.equalsIgnoreCase(pageTitle))
		{
			System.out.println(title+ " and " +pageTitle+  " matches");
			return true;	
		}
		else
		{
			System.out.println(title+ " and " +pageTitle+  " not matches");
			return false;	
		}
	}

	public void verifyTextById(String id, String text) {
		
		try {
			String getTextByID= driver.findElementById(id).getText();
			if(getTextByID.contains(text)||getTextByID.equalsIgnoreCase(text))
						System.out.println(getTextByID+ " and " +text+  " matches");
			else
				System.out.println(getTextByID+ " and " +text+  " not matches");
			// TODO Auto-generated method stub
		}catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}

	public void verifyTextByXpath(String xpath, String text) 
	{
		try {
			String text1 = driver.findElementByXPath(xpath).getText();
			if(text.equals(text1))
			{
				System.out.println("Text matches");
			}
			else 
			{
				System.out.println("Text not matches");
			}
		}catch (NoSuchElementException e) {
			System.err.println("Element "+xpath+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) 
	{
		// TODO Auto-generated method stub
		 try {
			String xpathText = driver.findElementByXPath(xpath).getText();
			if(xpathText.contains(text))
			{
				System.out.println(xpathText+ "and" +text+ "Text matches");
			}
			else 
			{
				System.out.println(xpathText+ "and" +text+ "Text not matches");
			}
		}catch (NoSuchElementException e) {
			System.err.println("Element "+xpath+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
			

	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}

	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			}catch (NoSuchElementException e) {
			System.err.println("Element "+classVal+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			} catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}

	}

	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			} catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not accessable");
			throw new RuntimeException();
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}finally {
			takeSnap();
		}

	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
		}catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}


	}

	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			takeSnap();
			}catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not accessable");
			}catch (NoSuchWindowException e) {
				System.err.println("Window was  already closed");
			}catch (WebDriverException e){
				System.err.println("The Browser is unreachable");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
		}catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}

	}

	public String getTextById(String idVal) {
		try {
			String textID=driver.findElementById(idVal).getText();
			if(textID.equalsIgnoreCase("Duplicate Lead"))
			  {
				System.out.println("Text Matches");
			  }
			else
			  {
				
				System.out.println("Text not Matches");
			  }
			}catch (NoSuchElementException e) {
			System.err.println("Element "+idVal+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		String capturedName = null;
		try {
			capturedName=driver.findElementByXPath(xpathVal).getText();
			//return capturedName; //changed from Null because the return type is string
		}catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
		return capturedName;
	}

	public void selectVisibileTextById(String id, String value) 
	{
		try {
			WebElement link= driver.findElementById(id);
			Select fromDropdown = new Select(link);
			fromDropdown.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
    }

	public void selectIndexById(String id, int value) {
		try {
			WebElement link= driver.findElementById(id);
			Select fromDropdown = new Select(link);
			fromDropdown.selectByIndex(value);
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}

	public void selectIndexByName(String name, int value) {
		try {
			WebElement link= driver.findElementByName(name);
			Select fromDropdown = new Select(link);
			fromDropdown.selectByIndex(value);
		} catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}

	}
	
	public void selectValueById(String id, String value) {
		try {
			WebElement link= driver.findElementById(id);
			Select fromDropdown = new Select(link);
			fromDropdown.selectByValue(value);
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not accessable");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}
		
	public void switchToParentWindow() 
	{
		//String parentWindow=driver.getWindowHandle();
		try {
			driver.switchTo().window(parentWindow);
		} catch (NoSuchWindowException e) {
			System.err.println("Control not moved to Parent Window");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}

	public void switchToLastWindow() 
	{
		try {
			parentWindow=driver.getWindowHandle();
			//driver.switchTo().window(parentWindow);
			Set<String> windowHandles= driver.getWindowHandles();
			for(String currentWindowHandle:windowHandles)
			{
				driver.switchTo().window(currentWindowHandle);
				//System.out.println(currentWindowHandle);
			}
		}  catch (NoSuchWindowException e) {
			System.err.println("Control not moved to the current Window");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}

	}

	public void acceptAlert() 
	{
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println("Control not moved to the alert");
		}catch (UnhandledAlertException e) {
			System.err.println("Alert not handled");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
	}
	
	

	public void dismissAlert() {
		// TODO Auto-generated method stub

	} 

	public String getAlertText() {
		String alerText = null;
		try {
			alerText= driver.switchTo().alert().getText();
			System.out.println(alerText);
			
		}  catch (NoAlertPresentException e) {
			System.err.println("Control not moved to the alert");
		}catch (UnhandledAlertException e) {
			System.err.println("Alert not handled");
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}
		return alerText;
	} 

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;

	}

	public void closeBrowser() {
		try {
			driver.close();
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
		}catch (WebDriverException e){
			System.err.println("The Browser is unreachable");
		}

	}

}
