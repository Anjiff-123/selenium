package base_check;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class base_test {
	public WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void checkeverything(String browser_name) {
		
		switch(browser_name)
		{
			case "chrome":System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				    driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					break;
			
			case "edge":System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
				    driver=new EdgeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					break;
		}
		
	}
	
	
	@AfterClass
	public void breakit(){
		driver.quit();
	}
}
