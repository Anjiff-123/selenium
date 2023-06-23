package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWSFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		String parent=driver.getWindowHandle();
		Set<String> child_windows = driver.getWindowHandles();

		(driver.findElement(By.xpath("//a[text()='Facebook']"))).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
