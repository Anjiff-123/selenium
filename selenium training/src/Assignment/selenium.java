package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable notifications");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyundai.com/in/en/find-a-car/exter.html?utm_source=Search&utm_medium=SOV&utm_campaign=Always_On_Hyundai_Brand&utm_term=EXTER&gclid=CjwKCAjw4ZWkBhA4EiwAVJXwqZNIqw7bYfc5clpEgQ7aj37MYTqlZFkpTBx0-P7AQdgJLTlVrb8XKBoCwJoQAvD_BwE");
		System.out.println("browser opened");
	}

}
