package SeleniumPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pgm1 {
	public static void main(String[] args) throws InterruptedException {
		
		HashMap<Integer,Character> h=new HashMap<>();
		h.put(1,'h');
		h.put(2,'r');
		h.put(3,'t');
		h.put(4,'o');
		h.put(1,'n');
		h.put(5,'h');
		System.out.println(h);
		
		Set s=h.keySet();
		System.out.println(s);
		
		Collection c=h.values();
		System.out.println(c);
		
		for(Map.Entry<Integer,Character> i:h.entrySet()) {
			System.out.println(i.getKey()+":"+i.getValue());
		}
		h.replace(1, 'c');
		System.out.println(h.get(1));
		System.out.println(h);
	}
}
