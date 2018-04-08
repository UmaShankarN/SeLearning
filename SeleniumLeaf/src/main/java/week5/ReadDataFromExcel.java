package week5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
//	@Test
	public static Object[][] readDataFromExcel() throws InvalidFormatException, IOException{
		
		
		File file = new File("./Data/TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet ws = wb.getSheet("Login");
		
		//System.out.println(ws.getLastRowNum());
		int rowCount= ws.getLastRowNum();
		int columnCount= ws.getRow(0).getLastCellNum();
		//System.out.println(columnCount);	
		//System.out.println(ws.getRow(1).getCell(0).getStringCellValue());
		Object[][] data = new Object[rowCount][columnCount];
		
		for(int i=1;i<=ws.getLastRowNum();i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				data[i-1][j]=ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(ws.getRow(i).getCell(j).getStringCellValue());
				
			}
		}
		
		return data;
	}

	
	
}
