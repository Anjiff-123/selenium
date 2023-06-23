package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(@href,'/register')]")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("(//input[contains(@data-val-required,'First name')])")).sendKeys("dhadhaa");
		driver.findElement(By.xpath("(//input[contains(@data-val-required,'Last name')])")).sendKeys("djad");
		driver.findElement(By.xpath("(//input[contains(@data-val-required,'Email is ')])")).sendKeys("fgsjgjj23423@gmail.com");
		driver.findElement(By.xpath("//input[@data-val-required='Password is required.']")).sendKeys("asdfgh12@");
		driver.findElement(By.xpath("(//input[@data-val-required='Password is required.'])[2]")).sendKeys("asdfgh12@");
		driver.findElement(By.xpath("(//input[@value='Register'])")).click();
		driver.quit();
	}

}
