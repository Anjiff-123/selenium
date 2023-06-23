  package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsinShoppersstack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/user-signin");
		Thread.sleep(30000000l);
		driver.findElement(By.id("Email")).sendKeys("anjisabharish0000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anji123!");
		driver.findElement(By.id("Login")).click();
		driver.quit();
		
		

	}

}
