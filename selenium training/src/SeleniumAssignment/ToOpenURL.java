package SeleniumAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenURL {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(15000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//Thread.sleep(15000);
		//js.executeScript("window.scrollBy(0,500);");
		//WebElement ele = driver.findElement(By.xpath("//h1[text()='about']"));
		//Point point = ele.getLocation();
		//int x=point.getX();
		//int y=point.getY();
		//js.executeScript("window.scrollTo(x,y);");
		//js.executeScript("arguments[0].scrollIntoView(false);",ele);
	}

}
