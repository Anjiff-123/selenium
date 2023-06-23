package WorkingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoTitlesInDWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> list1 = driver.findElements(By.xpath("//a"));
		for(WebElement ele:list1) {
			System.out.println(ele.getText());
		}
		System.out.println("no.links are:"+list1.size());
		driver.quit();
	}

}
