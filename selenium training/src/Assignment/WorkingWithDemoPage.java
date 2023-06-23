package Assignment;
import java.util.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoPage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/OneDrive/Desktop/dowloads%20content/demo.html");
		List<WebElement> list = driver.findElements(By.xpath("//input[contains(@name,'fname')]"));
		for(WebElement ele:list)
		{
			ele.sendKeys(s.next());
		}
		driver.quit();
		
	}

}
