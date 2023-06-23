package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAllOptionsInSortByUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(dropdown);
		
		List<WebElement> list = sel.getOptions();
		for(int i=0;i<list.size();i++) {
			dropdown = driver.findElement(By.id("products-orderby"));
			sel=new Select(dropdown);
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
