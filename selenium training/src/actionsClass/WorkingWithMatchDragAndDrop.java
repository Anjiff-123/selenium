package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMatchDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement destination = driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		Thread.sleep(3000);
		
		//driver.quit();
	}

}
