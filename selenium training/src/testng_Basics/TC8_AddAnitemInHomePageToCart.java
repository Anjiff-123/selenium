package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.AddAnItemInHomePageToCart;
import base_check.base_test;

public class TC8_AddAnitemInHomePageToCart extends base_test {
	@Test
	public void cart() throws InterruptedException {
		
		/*Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();
		Thread.sleep(3000);*/
		
		AddAnItemInHomePageToCart add=new AddAnItemInHomePageToCart(driver);
		add.getAddToCartButton().click();
		
		
		
	}
}
