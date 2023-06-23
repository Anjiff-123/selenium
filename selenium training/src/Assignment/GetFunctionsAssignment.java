package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFunctionsAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI8Nzflcv9_QIViZlmAh1WdwmAEAAYASAAEgI9cfD_BwE");
		String a=driver.getCurrentUrl();
		String b=driver.getPageSource();
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		WebElement msg=driver.findElement(By.xpath("//h4[contains(text(),'BEST OF MYNTRA EXCLUSIVE BRANDS')]"));
		System.out.println(msg.getText());
		WebElement msg1=driver.findElement(By.xpath("//input[contains(@placeholder,\"Search for products, brands and more\")]"));
		System.out.println(msg1.getAttribute("placeholder"));
		driver.quit();
	}
}
