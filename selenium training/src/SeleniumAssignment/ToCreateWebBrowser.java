package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCreateWebBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
	}

}
