package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CombineTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("driver launched");
		
		driver.manage().window().maximize();
		System.out.println("window maximized");
		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("demo web shop is opened");
		
		WebElement electronics = driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		System.out.println("electonics is being hovered");
		
		//action class initiation
		Actions action=new Actions(driver); //driver is the parameter
		action.moveToElement(electronics).perform(); //webelement is the parameter
		
		WebElement camera=driver.findElement(By.xpath("(//a[@href='/camera-photo'])[1]"));
		System.out.println("camera element is being clicked");
		action.click(camera).perform();
		Thread.sleep(3000);
	
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(sort); //webelement is passed as parameter
		//to select an option in dropdown
		sel.selectByVisibleText("Created on");
		System.out.println("sort dropdown is selected");
		Thread.sleep(3000);
		
		WebElement page=driver.findElement(By.id("products-pagesize"));
		sel=new Select(page);
		sel.selectByVisibleText("4");
		Thread.sleep(3000);
		
		System.out.println("page dropdown is selected");
		WebElement view=driver.findElement(By.id("products-viewmode"));
		sel=new Select(view);
		
		sel.selectByVisibleText("List");
		Thread.sleep(6000);
		System.out.println("view dropdown is selected");
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Show details for 1MP 60GB Hard Drive Handycam Camcorder']"));
		action.click(img).perform();
		System.out.println("product clicked");
		
		WebElement price = driver.findElement(By.xpath("(//span[@itemprop='price'])"));
		System.out.println(price.getText());
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		action.click(email).perform();
		
		WebElement friendmail = driver.findElement(By.id("FriendEmail"));
		friendmail.sendKeys("asf123@gmail.com");
		System.out.println("friend mail entered");
		
		WebElement yourmail = driver.findElement(By.id("YourEmailAddress"));
		yourmail.sendKeys("anji123@gmail.com");
		System.out.println("your mail entered");
		
		WebElement submit = driver.findElement(By.xpath("(//input[@value='Send email'])"));
		submit.click();
		System.out.println("email sent");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
