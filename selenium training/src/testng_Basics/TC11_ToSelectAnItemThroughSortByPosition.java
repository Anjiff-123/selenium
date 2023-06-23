package testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.ToSelectAnItemThroughSortByPosition;
import base_check.base_test;

public class TC11_ToSelectAnItemThroughSortByPosition extends base_test{
	@Test
	public void newsletter() throws InterruptedException {
		
		/*Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]"))).perform();
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		sel.selectByVisibleText("Price: High to Low");
		action.click(driver.findElement(By.xpath("(//img[@alt='Picture of Music 2'])[1]"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();*/
		
		ToSelectAnItemThroughSortByPosition select=new ToSelectAnItemThroughSortByPosition(driver);
		select.getDidgitaldownloads().click();
		Select sel=new Select(select.getProducts());
		sel.selectByVisibleText("Price: High to Low");
		select.getImage();
		select.getCart();
	}
}