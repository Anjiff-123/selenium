package SeleniumPractice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class  elementScreenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		driver.get("https://temples.vibhaga.com/");
		Thread.sleep(15000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
        WebElement element = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
        elementScreenshot(element,"Home");
        driver.quit();

    }
        public static void elementScreenshot(WebElement element, String Filename) throws IOException {
            File srcFile = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("./target/" + Filename+".png"));

        }

}
