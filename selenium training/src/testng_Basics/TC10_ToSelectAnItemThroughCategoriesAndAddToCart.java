package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.ToSelectAnItemThroughCategoriesPage;
import base_check.base_test;

public class TC10_ToSelectAnItemThroughCategoriesAndAddToCart extends base_test{
	@Test
	public void newsletter() throws InterruptedException {
		
		/*Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]"))).perform();
		action.click(driver.findElement(By.xpath("(//img[contains(@alt,'Picture for category Cell phones')])"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();*/
		
		ToSelectAnItemThroughCategoriesPage select=new ToSelectAnItemThroughCategoriesPage(driver);
		select.getElectronicsButton().click();
		select.getImage().click();
		select.getCart().click();
		
		
	}
}
