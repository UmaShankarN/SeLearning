package week5;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtentReports {

	public static void main(String[] args) 
	{
		ExtentReports extent = new ExtentReports("./reports/report.html", true);
		extent.loadConfig(new File("./src/main/resources/Extent-config.xml"));
		ExtentTest test = extent.startTest("Create Lead", "Create a New Lead");
		test.log(LogStatus.PASS, "Login Successful"+test.addScreenCapture("C:/Selenium/SeleniumLeaf/snaps/snap1.JPG"));
		extent.endTest(test);
		extent.flush();

	}

}
