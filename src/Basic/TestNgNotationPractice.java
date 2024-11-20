package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNgNotationPractice {

	@Test
	public void test1()
    {
		System.out.println("test1");
	}
	
	@Test
	public void test2()
    {
		System.out.println("test2");
	}
	
	@BeforeMethod
	public void beforeMethod()
    {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod()
    {
		System.out.println("after method");
	}
	
	@BeforeClass
	public void beforeClass()
    {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
    {
		System.out.println("after class");
	}
	
	@BeforeTest
	public void beforeTest()
    {
		System.out.println("before test");
	}
	
	@AfterTest
	public void AfterTest()
    {
		System.out.println("After test");
	}
}
