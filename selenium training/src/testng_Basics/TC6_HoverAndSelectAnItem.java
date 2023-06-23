package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.HoverAndSelectAnItenPage;
import base_check.base_test;

public class TC6_HoverAndSelectAnItem extends base_test{
	@Test
	public void hover() throws InterruptedException {
		
		HoverAndSelectAnItenPage hover=new HoverAndSelectAnItenPage(driver);
		
		Actions action=new Actions(driver);
		action.moveToElement(hover.getComputers()).click(hover.getText()).perform();
		//action.click(driver.findElement(By.xpath("//img[@alt='Picture of Build your own computer']"))).perform();
		
		hover.getText();
		
	}

}
