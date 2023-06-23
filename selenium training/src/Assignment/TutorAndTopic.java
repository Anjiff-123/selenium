package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorAndTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dr=driver.findElement(By.xpath("//td[contains(text(),'Rahul Shetty')]//..//td[contains(text(),'Selenium Webdriver with Java Basics + Advanced + Interview Guide')]//..//td[contains(text(),'30')]"));
		System.out.println(dr.getText());
		WebElement dr1=driver.findElement(By.xpath("//td[contains(text(),'Rahul Shetty')]//..//td[contains(text(),'Learn SQL in Practical + Database Testing from Scratch')]//..//td[contains(text(),'25')]"));
		System.out.println(dr1.getText());
		WebElement dr2=driver.findElement(By.xpath("//td[contains(text(),'Rahul Shetty')]//..//td[contains(text(),'WebSecurity Testing for Beginners-QA knowledge to next level')]//..//td[contains(text(),'20')]"));
		System.out.println(dr2.getText());
		driver.quit();
	}

}
