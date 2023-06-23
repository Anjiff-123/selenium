package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionsAndAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		act.contextClick(ele).click(edit).perform();
		
		Alert ale = driver.switchTo().alert();
		String str=ale.getText();
		System.out.println(str);
		ale.accept();
		Thread.sleep(2000);
		
		ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
		act.contextClick(ele).click(cut).perform();
		
		Alert ale1 = driver.switchTo().alert();
		String str1=ale1.getText();
		System.out.println(str1);
		ale1.accept();
		Thread.sleep(2000);
		
		ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.contextClick(ele).click(copy).perform();
		
		Alert ale2 = driver.switchTo().alert();
		String st=ale2.getText();
		System.out.println(st);
		ale2.accept();
		Thread.sleep(3000);
		
		ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
		act.contextClick(ele).click(paste).perform();
		
		Alert ale3 = driver.switchTo().alert();
		String strr=ale3.getText();
		System.out.println(strr);
		ale3.accept();
		Thread.sleep(3000);
		
		ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		act.contextClick(ele).click(delete).perform();
		
		Alert ale4 = driver.switchTo().alert();
		String strri=ale4.getText();
		System.out.println(strri);
		ale4.accept();
		Thread.sleep(3000);
		
		ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement quit= driver.findElement(By.xpath("//span[text()='Quit']"));
		act.contextClick(ele).click(quit).perform();
		
		Alert ale5 = driver.switchTo().alert();
		String strrin=ale5.getText();
		System.out.println(strrin);
		ale5.accept();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
