package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://temples.vibhaga.com");
		
		
	/*	WebElement ele=driver.findElement(By.xpath("//h2[text()='Temples to Visit This Week']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
		
		WebElement ele1=driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		boolean res=true;
		if(res==ele1.isDisplayed()) {
			System.out.println("isDisplayed");
		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		 System.out.println(elements.size());
		 
		
		List<WebElement> elements1 = driver.findElements(By.xpath("//a"));
		System.out.println(elements1.size());
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./screenshots/img.png"),true); */
		
		
		
		
		

	}

}
