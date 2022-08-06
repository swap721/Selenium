package org.testing.TestScripts_YTFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.assertions.Assert1;
import org.testing.base.BaseClass;
import org.testing.utilities.ScreenshotCapture;
import org.testing.utilities.logsCapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
{

	@Test
	public void test() throws InterruptedException, IOException
	{
		DOMConfigurator.configure("../SMproject/layout.xml");
		//LOGIN TO YOUTUBE
		String expectedUrl="https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl";
		Login lg=new Login(driver,pr);
		lg.Signin(pr.getProperty("Userid"), pr.getProperty("Password"));
		
				
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//First_1.PNG");
		logsCapture.takeLogs("TC1", "Login successfully for TC1");
		
		//CLICK ON TRENDING LINK
		HomePage h=new HomePage(driver, pr);
		h.trending();
		
		String actual=driver.getCurrentUrl();
		logsCapture.takeLogs(expectedUrl, actual);
		//Assert.assertEquals(actual, expectedUrl, "Trending page not open");
		System.out.println(actual);
		Assert1.assertion_1(expectedUrl, actual);
		
		//LOGOUT FROM YOUTUBE
				Logout lout=new Logout(driver, pr);
				lout.Signout();
				ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//First_2.PNG");
				logsCapture.takeLogs("TC1", "Logout successfully for TC1");
		
	}
}