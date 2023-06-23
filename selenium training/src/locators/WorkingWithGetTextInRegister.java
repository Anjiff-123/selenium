package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTextInRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Anji Sabharish");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("abghghgc123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Anji123!");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Anji123!");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		WebElement msg=driver.findElement(By.xpath("//li[contains(text(),'The specified email already ')]"));
		System.out.println(msg.getText());
		driver.quit();
	}

}
