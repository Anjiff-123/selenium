package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/anjis/Downloads/iframe.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='frame1']")));
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("hello");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
