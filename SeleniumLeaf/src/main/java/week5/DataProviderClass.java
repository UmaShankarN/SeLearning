package week5;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="fetchData")
	public Object[][] dataProvider() throws InvalidFormatException, IOException
	{
		
		
		return ReadDataFromExcel.readDataFromExcel();
		
	}

	
	
}
