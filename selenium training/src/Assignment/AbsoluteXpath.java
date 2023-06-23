package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/Downloads/xpath.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("anji");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Anji123#");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.quit();
	}

}
