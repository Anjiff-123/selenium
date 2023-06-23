package actionsClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/Downloads/MultipleWindow.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Set<String> child = driver.getWindowHandles();
		
		System.out.println(parent);
		System.out.println(child);
		
		for(String i:child) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(3000);
		}
		driver.switchTo().window(parent);
		driver.quit();
	}

}
