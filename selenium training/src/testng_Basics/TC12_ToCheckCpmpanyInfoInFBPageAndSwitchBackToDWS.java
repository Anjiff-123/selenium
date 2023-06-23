package testng_Basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWSPage;
import base_check.base_test;

public class TC12_ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWS extends base_test{
	@Test
	public void login() throws InterruptedException {
		
		/*driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sdjaydk23@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ankji123!");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//a[text()='Facebook']"))).perform();
		String parent=driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for(String i:child) {
			driver.switchTo().window(i);
			String s=driver.getTitle();
			if(s.equals("NopCommerce | Facebook")) {
				driver.close();
				System.out.println("fb closed");
			}
		}
		driver.switchTo().window(parent);*/
		
		
		ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWSPage check=new ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWSPage(driver);
		check.getLogin().click();
		check.getEmail().sendKeys("sdjaydk23@gmail.com");
		check.getPw().sendKeys("Ankji123!");
		check.getLoginbutton().click();
		check.getFb().click();
		String parent=driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for(String i:child) {
			driver.switchTo().window(i);
			String s=driver.getTitle();
			if(s.equals("NopCommerce | Facebook")) {
				driver.close();
				System.out.println("fb closed");
			}
		}
		driver.switchTo().window(parent);
		
		
	}
}
