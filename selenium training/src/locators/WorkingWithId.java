package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("gender-female")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Anji Sabharish");
		//Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("R");
		//Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("abghghgc123@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Anji123!");
		//Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Anji123!");
		//Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));
		driver.quit();
	}

}
