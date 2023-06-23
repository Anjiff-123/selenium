package Assignment;

import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TocheckItenInSortbyAndPrintIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(dropdown);
		
		List<WebElement> list = sel.getOptions();
		
		String s1="Created on";
		for(int i=0;i<list.size();i++) {
			if(s1.equals(list.get(i).getText())){
				System.out.println(i);
			}
		}
		driver.quit();
	}

}
