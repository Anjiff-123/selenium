package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oliveGarden {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anjis/Downloads/MultipleWindow.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		String s1="Olive Garden Italian Restaurant | Family Style Dining | Italian Food ";
		
		for(String w:child) {
			if((driver.getTitle()==(s1))) {
				driver.close();
			}
				driver.switchTo().window(w);
			
		}
		driver.switchTo().window(parent);
		//driver.close();



		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		


		
		
		
		
		
		}

}
