package org.testing.assertions;

import org.openqa.selenium.WebElement;

public class Assert1 
{
	public static void assertion_1(String exp, String actual)
	{
		if(exp.equals(actual))
		{
			System.out.println("Assertion is passed");
		}
		else
		{
			System.out.println("Assertion is failed");
		}
	}
	public static void assertion_2(WebElement button)
	{
		if(button.isDisplayed())
		{
		System.out.println("Assertion is pass");
		}
		else
		{
			System.out.println("Assertion is failed");
		}
	}
}
