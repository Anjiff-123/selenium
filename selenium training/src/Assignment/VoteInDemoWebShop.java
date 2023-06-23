package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VoteInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'E')]")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
