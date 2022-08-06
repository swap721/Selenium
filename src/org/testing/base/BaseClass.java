package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public ChromeDriver driver;
	public Properties pr;
	//Actions ac=new Actions(driver);
	//@Parameters({"ChromeBrowser","url"})
	@BeforeMethod
	public void browserOpen() throws IOException
	{
		File f=new File("../SMproject/Object.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(pr.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
	
}
