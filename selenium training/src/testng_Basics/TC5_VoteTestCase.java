package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.VoteTestCasePage;
import base_check.base_test;

public class TC5_VoteTestCase extends base_test{
	@Test
	public void vote() throws InterruptedException {
		
		/*Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("(//label[text()='Excellent'])"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@id='vote-poll-1'])"))).perform();*/
		
		VoteTestCasePage vote=new VoteTestCasePage(driver);
		vote.getExcellent().click();
		vote.getPoll().click();
		
		
	}
}
