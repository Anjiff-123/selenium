package testng_Basics;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.ToSearchAnItem;
import base_check.base_test;

public class TC16_ToSearchAnItem extends base_test {
	
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TC16");
		row_count = sheet.getPhysicalNumberOfRows()-1;
		column_count = sheet.getRow(0).getPhysicalNumberOfCells();
		Object obj[][]=new Object[row_count][column_count];
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<column_count;j++) {
				obj[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
	}
	
	@Test(dataProvider = "TestData")
	public void search(String product) {
		ToSearchAnItem sea=new ToSearchAnItem(driver);
		sea.getSearchbar().sendKeys(product);
		sea.getSearchbutton().click();
		
	}
}
