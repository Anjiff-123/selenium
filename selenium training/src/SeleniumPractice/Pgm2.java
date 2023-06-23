package SeleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm2 {

	public static void main(String[] args) {
		String s="123456";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int d=c[i]-48;
			switch (d) {
			case 1:System.out.println("one"
					+ "");
			break;
			
			case 2:System.out.println(2);
			break;
			
			case 3:System.out.println(3);
			break;
			
			case 4:System.out.println(4);
			break;
			
			case 5:System.out.println(5);
			break;
			
			case 6:System.out.println(6);
			break;
			
			default:System.out.println(0);
			break;
			
			}
		}
	}

}

