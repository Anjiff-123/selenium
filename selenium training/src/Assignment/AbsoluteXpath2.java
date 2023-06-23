package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/OneDrive/Desktop/dowloads%20content/xpath1.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Anji");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Sabharish");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TY");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("location");
		
		driver.quit();
	}

}
