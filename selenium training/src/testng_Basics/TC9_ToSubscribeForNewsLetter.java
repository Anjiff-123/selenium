package testng_Basics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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

import POM.ToSubscribeFoeNewsLetterPage;
import base_check.base_test;

public class TC9_ToSubscribeForNewsLetter extends base_test{
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TC2");
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
	public void newsletter(String email) throws InterruptedException {
		
		/*Actions action=new Actions(driver);
		action.sendKeys(driver.findElement(By.xpath("(//input[@id='newsletter-email'])")),email).perform();
		action.click(driver.findElement(By.xpath("(//input[@id='newsletter-subscribe-button'])"))).perform();*/
		
		ToSubscribeFoeNewsLetterPage subscribe=new ToSubscribeFoeNewsLetterPage(driver);
		subscribe.getNewsLetterButton().sendKeys(email);
		subscribe.getSubscribeButton().click();
	}	
}
