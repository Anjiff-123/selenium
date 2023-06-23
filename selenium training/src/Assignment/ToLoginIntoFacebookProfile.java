package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLoginIntoFacebookProfile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=15461201666&extra_1=s%7Cc%7C589521732875%7Cb%7Cfacebook%20%27%7C&placement=&creative=589521732875&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D15461201666%26adgroupid%3D130924380175%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062072%26loc_interest_ms%3D9301896%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwoIqhBhAGEiwArXT7K-yxG6N-JCoHBh3DloyzMxOE3gKS7XdKR_TSH4WR15rz5nYqt5jwAxoCnuAQAvD_BwE");
		
		driver.findElement(By.name("firstname")).sendKeys("Anji");
		driver.findElement(By.name("lastname")).sendKeys("Sabharish");
		driver.findElement(By.name("reg_email__")).sendKeys("abcdef123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcdef123@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Anji123#");
	
		WebElement day = driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByVisibleText("6");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selec=new Select(month);
		selec.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel1=new Select(year);
		sel1.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.quit();
	}
}
