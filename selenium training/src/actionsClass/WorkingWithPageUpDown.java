package actionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithPageUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		
	}

}
