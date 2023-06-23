package testng_topics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Working_with_parameter {
	@Parameters({"Browser","url"})
	@Test
	public void demo(String rl,String Browser) {
		System.out.println(Browser);
		System.out.println(rl);
	}
	
	@Parameters({"url"})
	@Test
	public void sy(String rl) {
		System.out.println(rl);
	}
}




