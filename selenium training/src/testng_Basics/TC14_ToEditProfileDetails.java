package testng_Basics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.ToEditProfilePage;
import base_check.base_test;

public class TC14_ToEditProfileDetails extends base_test{
	
	@DataProvider(name="TestData")
	public Object[][] data() {
		Scanner s=new Scanner(System.in);
		Object[][] obj=new Object[1][3];
		obj[0][0]="sdjaydk23@gmail.com";
		obj[0][1]="Ankji123!";
		obj[0][2]="sizzlerr";
		
		return obj;
	}
	@Test(dataProvider = "TestData")
	public void edit(String email,String pw,String lastname) {
		/*driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[@href='/customer/info'])[1]")).click();
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@value='Save']")).click();*/
		
		ToEditProfilePage edit=new ToEditProfilePage(driver);
		edit.getLogin().click();
		edit.getEmail().sendKeys(email);
		edit.getPw().sendKeys(pw);
		edit.getLoginbutton().click();
		edit.getCostomerinfo().click();
		edit.getLastname().clear();
		edit.getLastname().sendKeys(lastname);
		edit.getSave().click();
		
	}
}
