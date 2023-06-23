package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To navigate to any website through url
		driver.get("https://demowebshop.tricentis.com/");
		
		//To refresh the webpage
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		//To navigate to another website
		driver.get("https://shoppersstack.com/");
		//driver.navigate().forward();
		
		//To navigate back
		driver.navigate().back();
		
		//To close only parent window(runs in background internally)
		//driver.close();
		
		//To close both the parent and child window(quits the entire applicaton)
		driver.quit();
	}

}
