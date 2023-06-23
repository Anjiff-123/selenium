package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/OneDrive/Desktop/dowloads%20content/css_selector.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("anji");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jgsjs233#");
		
		//driver.quit();
	}

}
