package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextOfAllItemsInSortByUsingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(dropdown);
		
		List<WebElement> list = sel.getOptions();
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
