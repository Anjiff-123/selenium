package Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsLetterDWS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//img[@title='Show details for Computing and Internet']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
		Thread.sleep(1000);
		WebElement msg = driver.findElement(By.xpath("//p[@class='content']"));
		System.out.print(msg.getText());
		Thread.sleep(1000);
		WebElement msg2 = driver.findElement(By.xpath("//a[text()='shopping cart']"));
		System.out.println(msg2.getText());
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='newsletter-email']"));
		ele.sendKeys("asdf123@gmail.com");
		ele.clear();
		ele.sendKeys("asdf1223@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Thread.sleep(3000);
		WebElement msg3 = driver.findElement(By.id("newsletter-result-block"));
		System.out.println(msg3.getText());
		
		driver.quit();
		
	}

}
