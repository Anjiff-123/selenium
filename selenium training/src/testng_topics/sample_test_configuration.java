package testng_topics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample_test_configuration {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("executing before suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("executing before class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before method");
	}
	@BeforeMethod
	public void befforemethod() {
		System.out.println("before method");
	}
	@Test
	public void test() {
		System.out.println("welcome to testng");
	}
	@Test
	public void test1() {
		System.out.println("welcome to testng1");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("execuing after method");
	}
	@AfterMethod
	public void afftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("executing after class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("executing after test");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("executing after suite");
	}
	@Test()
	public void test3() {
		System.out.println("welcometo testng2");
	}
}
