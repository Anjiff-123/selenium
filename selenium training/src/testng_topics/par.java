package testng_topics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class par {
	
	
	@Parameters({"name"})
	@Test
	public void met(String x) {
		System.out.println(x);
	}
	

}
