package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidatingLoginInDWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="anjisabharish0000@gmail.com";
		String password="Anji123!";
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("empty browser is created");
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("demo web shop is launched");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		System.out.println("login page is obtained");
		
		WebElement email1 = driver.findElement(By.id("Email"));
		email1.clear();
		email1.sendKeys(email);
		String output=email1.getAttribute("value");
		if(email.equals(output))
		{
			System.out.println("entered values are same");
			System.out.println(output);
		}
		else {
			System.out.println("entered values are not same");
		}
		WebElement pw = driver.findElement(By.id("Password"));
		pw.clear();
		pw.sendKeys(password);
		String output1=pw.getAttribute("value");
		if(password.equals(output1))
		{
			System.out.println("entered values are same");
			System.out.println(output1);
		}
		else {
			System.out.println("entered values are not same");
		}
		
		driver.quit();
		}
	

}
