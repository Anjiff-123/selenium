package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSkillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement ele = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
		Thread.sleep(3000);
		action.doubleClick(ele).perform();
		Thread.sleep(3000);
		
		driver.quit();
		}

}
