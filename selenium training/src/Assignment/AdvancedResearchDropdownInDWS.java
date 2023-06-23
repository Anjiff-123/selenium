package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedResearchDropdownInDWS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement dropdown = driver.findElement(By.id("Cid"));
		Select sel=new Select(dropdown);
		
		sel.selectByIndex(4);
		List<WebElement> list = sel.getOptions();
		System.out.println(list.get(4).getText());
		System.out.println();
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		
		driver.quit();

	}

}
