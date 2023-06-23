package testng_Basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Search_ItemsPage;
import base_check.base_test;

public class TC3_Search_items extends base_test {
	
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TC3");
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
	public void search(String search) throws InterruptedException {
		
		Actions action=new Actions(driver);
		/*action.click(driver.findElement(By.xpath("//input[@id='small-searchterms']"))).sendKeys(search).perform();
		action.click(driver.findElement(By.xpath("(//input[@type='submit'])[1]"))).perform();*/
		
		Search_ItemsPage Search=new Search_ItemsPage(driver);
		Search.getSearchBarTextField().sendKeys(search);
		Search.getSubmitButton().click();
		
		
		
		
		
	}
}
