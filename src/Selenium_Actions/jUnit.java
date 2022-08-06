package Selenium_Actions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class jUnit 
{
	@Test
	public void abc()
	{
		System.out.println("sign-up1 test code method");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("sign-up2 test code method");
	}
	@Before
	public void precondition()
	{
		System.out.println("Before test method");
	}
	
	@After
	public void def()
	{
		System.out.println("After the method");
	}
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Beforeclass method");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("Afterclass");
	}
}
