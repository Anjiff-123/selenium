package testng_topics;

import org.testng.annotations.Test;

public class sample_test_priorityForAnnotations {
	/*@Test(priority =2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 1)
	public void register() {
		System.out.println("register");
	}
	@Test(priority = 3)
	public void search() {
		System.out.println("search");
	} */
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("login");
	}
	@Test
	public void register() {
		System.out.println("register");
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("search");
	}
}
