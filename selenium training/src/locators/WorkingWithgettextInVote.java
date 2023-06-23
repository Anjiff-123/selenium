package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgettextInVote {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//label[contains(text(),'Excellent')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'vote-poll-1')]")).click();
		Thread.sleep(3000);
		WebElement msg=driver.findElement(By.xpath("(//div[contains(text(),'Only registered users can vote')])"));
		System.out.println(msg.getText());
		driver.quit();
	}

}
