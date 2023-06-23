package testng_topics;

import org.testng.annotations.Test;

public class SampleTestExecutingMethodsOrder {
	@Test
	public void A() {
		System.out.println("A");
	}
	@Test
	public void a() {
		System.out.println("a");
	}
	@Test
	public void b() {
		System.out.println("b");
	}
	@Test
	public void B() {
		System.out.println("B");
	}
	


}
