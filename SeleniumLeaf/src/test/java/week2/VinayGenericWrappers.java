package week2;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class VinayGenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	String parentWindow;
	int i = 1;
	
	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();	
		} else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer32.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		takeSnap();
	}

	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		takeSnap();
		System.out.println(data+" is entered successfully");
	}

	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);
		takeSnap();
		System.out.println(data+" is entered successfully");
	}

	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath(xpathValue).clear();
		driver.findElementByXPath(xpathValue).sendKeys(data);
		takeSnap();
		System.out.println(data+" is entered successfully");

	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextById(String id, String text) {
	
		String output = driver.findElementById(id).getText();
		if(output.equalsIgnoreCase(text))
		{
			System.out.println("Entered "+text+" is Matched with the "+output);
		}
		else{
			System.out.println("Entered "+text+" is not Matched with the "+output);
		}
		

	}

	public void verifyTextByXpath(String xpath, String text) {
		String output = driver.findElementByXPath(xpath).getText();
		if(output.equalsIgnoreCase(text))
		{
			System.out.println("Entered "+text+" is Matched with the "+output);
		}
		else{
			System.out.println("Entered "+text+" is not Matched with the "+output);
		}
		

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void clickById(String id) {
		driver.findElementById(id).click();
		takeSnap();

	}

	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		takeSnap();
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLink(String name) {
		driver.findElementByLinkText(name).click();
		takeSnap();

	}

	public void clickByLinkNoSnap(String name) {
		driver.findElementByLinkText(name).click();

	}

	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		//takeSnap();

	}

	public void clickByXpathNoSnap(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
	}

	public String getTextById(String idVal) {
		String text = driver.findElementById(idVal).getText();
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		
		WebElement element = driver.findElementById(id);
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
		takeSnap();
		System.out.println(value+" is selected successfully");

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		driver.switchTo().window(parentWindow);

	}

	public void switchToLastWindow() {
		parentWindow = driver.getWindowHandle();
		Set<String> allWindows =driver.getWindowHandles();
		for(String lastWindow:allWindows)
		{
			driver.switchTo().window(lastWindow);
		}

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
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
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}	

}
