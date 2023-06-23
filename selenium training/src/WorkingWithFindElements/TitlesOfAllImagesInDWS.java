package WorkingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlesOfAllImagesInDWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> list1 = driver.findElements(By.xpath("//img"));
		for(WebElement ele:list1) {
			System.out.println(ele.getAttribute("title"));
		}
		System.out.println(list1.size());
		driver.quit();
	}

}
