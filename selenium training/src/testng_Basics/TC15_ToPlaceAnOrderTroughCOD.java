package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base_check.base_test;

public class TC15_ToPlaceAnOrderTroughCOD {
	
	@Test
	public void order() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sdjaydk23@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ankji123!");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]"))).perform();
		action.click(driver.findElement(By.xpath("(//img[contains(@alt,'Picture for category Cell phones')])"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();
		
		action.click(driver.findElement(By.xpath("//span[text()='Shopping cart']"))).perform();
		action.click(driver.findElement(By.xpath("//input[@id='termsofservice']"))).perform();
		action.click(driver.findElement(By.xpath("//button[@id='checkout']"))).perform();
		
		/*Select select=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		select.selectByVisibleText("BillingNewAddress_CountryId");
		
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("banglore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("34/23");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("hfjhaska");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("23334");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9876543212");*/
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();
		action.click(driver.findElement(By.xpath("(//input[@value='Continue'])[2]")));
		action.click(driver.findElement(By.xpath("(//input[@value='Continue'])[4]")));
		action.click(driver.findElement(By.xpath("(//input[@value='Continue'])[5]")));
		action.click(driver.findElement(By.xpath("(//input[@value='Confirm'])")));
		action.click(driver.findElement(By.xpath("(//input[@value='Continue'])")));
		
		driver.quit();
		
	}
}
