package selectClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/anjis/OneDrive/Desktop/dowloads%20content/demo.html");
		WebElement dropdown = driver.findElement(By.id("standard_cars"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("hda");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
