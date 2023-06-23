package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopWorkingWithPreferredLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Anji Sabharish");
		driver.findElement(By.name("LastName")).sendKeys("R");
		driver.findElement(By.id("Email")).sendKeys("sdjadk23@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anji123!");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Anji123!");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
