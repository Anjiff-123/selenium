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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Advance_Search;
import base_check.base_test;

public class TC4_AdvancedSearch extends base_test{
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TC4");
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
	public void search(String search,String pf,String pt) throws InterruptedException {
		
		Actions action=new Actions(driver);
		/*action.click(driver.findElement(By.xpath("//input[@id='small-searchterms']"))).sendKeys(search).perform();
		action.click(driver.findElement(By.xpath("(//input[@type='submit'])[1]"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@id='As'])"))).perform();
		
		Select sel=new Select(driver.findElement(By.xpath("(//select[@id='Cid'])")));
		sel.selectByVisibleText("Electronics >> Cell phones");
		sel=new Select(driver.findElement(By.xpath("(//select[@id='Mid'])")));
		sel.selectByVisibleText("Tricentis");
		
		driver.findElement(By.id("Pf")).sendKeys(pf);
		driver.findElement(By.id("Pt")).sendKeys(pt);
		action.click(driver.findElement(By.xpath("(//input[@type='submit'])[2]"))).perform();*/
		//Thread.sleep(3000);
		
		Advance_Search as=new Advance_Search(driver);
		as.getSearchBar().sendKeys(search);
		as.getSearchButton().click();
		as.getAs().click();
		
		Select sel=new Select(as.getCid());
		sel.selectByVisibleText("Electronics >> Cell phones");
		sel=new Select(as.getMid());
		sel.selectByVisibleText("Tricentis");
		
		as.getPf().sendKeys(pf);
		as.getPt().sendKeys(pt);
		as.getSubmitButton().click();
		
		
		
		
	}
}
