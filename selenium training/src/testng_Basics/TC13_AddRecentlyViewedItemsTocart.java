package testng_Basics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.AddRecentlyViewedItemsTocartpage;
import base_check.base_test;

public class TC13_AddRecentlyViewedItemsTocart extends base_test {
	
	@DataProvider(name="TestData")
	public Object[][] data() {
		Scanner s=new Scanner(System.in);
		Object[][] obj=new Object[1][2];
		obj[0][0]="sdjaydk23@gmail.com";
		obj[0][1]="Ankji123!";
		
		return obj;
	}
	@Test(dataProvider = "TestData")
	public void login(String email,String pw) throws InterruptedException {
		
		/*driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.navigate().refresh();
		Actions action=new Actions(driver);*/
	//	action.click(driver.findElement(By.xpath("//a[text()='Music 2']"))).perform();
		//action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();
		
		AddRecentlyViewedItemsTocartpage add=new AddRecentlyViewedItemsTocartpage(driver);
		add.getLogin().click();
		add.getEmail().sendKeys(email);
		add.getPw().sendKeys(pw);
		add.getLoginbutton().click();
	}
}
