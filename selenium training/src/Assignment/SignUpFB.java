package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062083%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI3umL1Y77_QIV2DArCh102g66EAAYASAAEgJgQPD_BwE");
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Anji");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sabharish");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sadakhdkklklkl@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sadakhdkklklkl@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("anji123#");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("3");
		driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Apr");
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("2002");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
