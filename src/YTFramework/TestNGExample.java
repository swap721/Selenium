package YTFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample 
{
	@Test(dependsOnMethods = "abc")
	public void swapnilM()
	{
		System.out.println("Test Annotation 3");
	}
	@Test(enabled = false)
	public void swapnil()
	{
		System.out.println("Test Annotation 2");
	}
	@AfterSuite
	public void bsuitechs()
	{
		System.out.println("AFter Suite");
	}
	@AfterTest
	public void bsuitech()
	{
		System.out.println("AFter Test");
	}
	@AfterClass
	public void bsuitec()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void bsuitea()
	{
		System.out.println("After Method");
	}
	@Test(priority=2)
	public void abc()
	{
		System.out.println("Test Annotation 1");
	}
	@BeforeMethod
	public void bsuitem()
	{
		System.out.println("before Method");
	}
	@BeforeClass
	public void bsuitej()
	{
		System.out.println("before Class");
	}
	@BeforeTest
	public void bsuitee()
	{
		System.out.println("before test");
	}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("before suite");
	}
}
