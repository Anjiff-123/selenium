package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFunctionsInDWs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sel =new Select(dropdown);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		dropdown = driver.findElement(By.id("products-orderby"));
		sel =new Select(dropdown);
		sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		Thread.sleep(2000);
		
		dropdown = driver.findElement(By.id("products-orderby"));
		sel =new Select(dropdown);
		sel.selectByVisibleText("Price: High to Low");
		Thread.sleep(2000);
		
		
		
		WebElement dropdown2 = driver.findElement(By.id("products-pagesize"));
		Select sel1=new Select(dropdown2);
		sel1.selectByIndex(0);
		Thread.sleep(2000);
		
		WebElement dropdown3 = driver.findElement(By.id("products-pagesize"));
		sel1=new Select(dropdown3);
		sel1.selectByVisibleText("8");
		Thread.sleep(2000);
		
		WebElement dropdown4 = driver.findElement(By.id("products-pagesize"));
		sel1=new Select(dropdown4);
		sel1.selectByVisibleText("12");
		Thread.sleep(2000);
		driver.quit();
	}

}
