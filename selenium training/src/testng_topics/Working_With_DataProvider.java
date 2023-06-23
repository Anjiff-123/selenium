package testng_topics;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Working_With_DataProvider {

	
	@DataProvider(name="TestData")
	public Object[][] data() {
		Scanner s=new Scanner(System.in);
		Object[][] obj=new Object[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				obj[i][j]=s.next();
			}
		}
		
		return obj;
	}
	
	@Test(dataProvider = "TestData")
	public void webshop(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
	}
}
