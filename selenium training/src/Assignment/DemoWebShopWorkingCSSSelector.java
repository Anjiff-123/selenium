package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class DemoWebShopWorkingCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[value='M']")).click();
		driver.findElement(By.cssSelector("input[data-val-required='First name is required.']")).sendKeys("Anji Sabharish");
		driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("R");
		driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("azsxdc8212@gmail.com");
		driver.findElement(By.cssSelector("input[data-val-required='Password is required.']")).sendKeys("Abcd123!");
		driver.findElement(By.cssSelector("input[data-val-equalto='The password and confirmation password do not match.']")).sendKeys("Abcd123!");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
