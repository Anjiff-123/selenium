package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	driver.findElement(By.xpath("(//input[@value=\"M\"])")).click();
	driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).sendKeys("Anji");
	driver.findElement(By.xpath("(//input[@type=\'text\'])[4]")).sendKeys("R");
	driver.findElement(By.xpath("(//input[@type=\'text\'])[5]")).sendKeys("shdgaak@gmail.com");
	driver.findElement(By.xpath("(//input[@type=\'password\'])[1]")).sendKeys("gsja345222@");
	driver.findElement(By.xpath("(//input[@type=\'password\'])[2]")).sendKeys("gsja345222@");
	driver.findElement(By.xpath("(//input[@value=\'Register\'])[1]")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
