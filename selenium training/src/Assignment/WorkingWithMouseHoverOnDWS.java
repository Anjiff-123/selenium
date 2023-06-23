package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMouseHoverOnDWS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement hover = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		Actions action=new Actions(driver);
		WebElement nb = driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]"));
		
		action.moveToElement(hover).click(nb).perform();
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
