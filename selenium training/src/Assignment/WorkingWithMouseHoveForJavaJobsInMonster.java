package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMouseHoveForJavaJobsInMonster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		WebElement job = driver.findElement(By.xpath("//a[@href='/skillyst']"));
		Actions action=new Actions(driver);
		WebElement jav=driver.findElement(By.xpath("//a[@href='https://www.foundit.in/skillyst/assessments/12-backend-java-test']"));
		action.moveToElement(job).click(jav).perform();
		Thread.sleep(4000);
		driver.quit();
	}

}
