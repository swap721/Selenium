package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logout 
{
	public ChromeDriver driver;
	public Properties pr;
	public Logout(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Signout() throws InterruptedException
	{
		Actions ac= new Actions(driver);
		driver.findElement(By.xpath(pr.getProperty("Avtarbutton"))).click();	Thread.sleep(2000);
		//for(int i=0;i<6;i++) { ac.sendKeys(Keys.TAB).perform();Thread.sleep(500); }
		driver.findElement(By.xpath(pr.getProperty("Signout"))).click();
		ac.sendKeys(Keys.ENTER).perform();Thread.sleep(3000);
	}
}
