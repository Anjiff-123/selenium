package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Anji Sabharish");
		driver.findElement(By.name("LastName")).sendKeys("R");
		driver.findElement(By.name("Email")).sendKeys("asdf123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("abcde123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("abcde123");
		driver.findElement(By.name("register-button")).click();
		
		driver.quit();
		

	}
}
