package testng_Basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.statics.Pass1Verifier;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.RegisterPage;
import base_check.base_test;

public class TC1_RegisterTestCase extends base_test{
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TC1");
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
	public void register(String firstname,String lastname,String email,String pw,String cpw) {
		
		/*driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.name("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pw);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpw);
		driver.findElement(By.id("register-button")).click();*/
		
		RegisterPage reg=new RegisterPage(driver);
		reg.getRegisterLink().click();
		reg.getGenderButton().click();
		reg.getFirstNameTextField().sendKeys(firstname);
		reg.getLastNameTextField().sendKeys(lastname);
		reg.getEmailTextField().sendKeys(email);
		reg.getPasswordTextField().sendKeys(pw);
		reg.getConfirmPasswordTextField().sendKeys(cpw);
		reg.getRegisterButton().click();
		
		
	}
}
