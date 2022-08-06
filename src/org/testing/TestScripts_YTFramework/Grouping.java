package org.testing.TestScripts_YTFramework;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping 
{
	@BeforeMethod
	public void grp()
	{
		System.out.println("Before method");
	}
	@Test(groups = "Smoke")
	public void grp2()
	{
		System.out.println("Test smoke1 method");
	}
	@Test(groups = "Smoke")
	public void grp3()
	{
		System.out.println("Test smoke2 method");
	}
	@Test(groups = "Sanity")
	public void grp1()
	{
		System.out.println("Test Sanity method");
	}
	@AfterMethod
	public void grp4()
	{
		System.out.println("After method");
	}
}
