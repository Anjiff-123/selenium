package testng_topics;

import org.testng.annotations.Test;

public class Working_with_Include_Exclude {
	@Test
	public void register() {
		System.out.println("Register");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void search() {
		System.out.println("Search");
	}
	
	@Test
	public void AddToCart() {
		System.out.println("Add to cart");
	}
	
	@Test
	public void profile() {
		System.out.println("Profile");
	}
}
