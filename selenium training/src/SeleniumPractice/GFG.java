package SeleniumPractice;

import java.awt.image.BufferedImage;

//Java program how to take
//a screenshot in Selenium
//WebDriver

import java.io.*;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



class GFG {
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://temples.vibhaga.com/");
		Thread.sleep(15000);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		File scrFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile,new File("./screenshots/ele.png"));
		
		
		
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		Thread.sleep(3000);
		
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		  //Used selenium Point class to get x y coordinates of Image element.
		  //get location(x y coordinates) of the element.
		 Point point = element.getLocation();
		  int xcordinate = point.getX();
		  int ycordinate = point.getY();

		  //Used selenium getSize() method to get height and width of element.
		  //Retrieve width of element.
		  int imageWidth = element.getSize().getWidth();
		  int imageHeight = element.getSize().getHeight();

		  //Reading full image screenshot.
		  BufferedImage img = ImageIO.read(screen);

		  //cut Image using height, width and x y coordinates parameters.
		  BufferedImage destination = img.getSubimage(xcordinate, ycordinate, imageWidth, imageHeight);
		  ImageIO.write(destination, "png", screen);

		  //save Image screenshot In D: drive.
		  FileUtils.copyFile(screen, new File("./screenshots/element.png"));*/
		  
		
		
		//To Screenshot entire visible webpage
	/*	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshots/.png"), true);*/
		
		driver.quit();
	}

}

