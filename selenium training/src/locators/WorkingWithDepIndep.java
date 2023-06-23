package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDepIndep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("System.setProperty(\"webdriver.chrome.driver\",\"./driver/chromedriver.exe\");\r\n"
				+ "		WebDriver driver=new ChromeDriver();\r\n"
				+ "		driver.manage().window().maximize();\r\n"
				+ "		driver.get(\"https://demowebshop.tricentis.com/\");"));
	}

}
