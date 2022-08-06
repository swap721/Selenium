package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	public ChromeDriver driver;
	public Properties pr;
	public HomePage(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void trending() throws InterruptedException
	{
		driver.findElement(By.linkText(pr.getProperty("Explore"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("Trending"))).click(); Thread.sleep(7000);
	}
	public void history () throws InterruptedException
	{
		driver.findElement(By.linkText(pr.getProperty("History"))).click();
		Thread.sleep(7000);
	}
	public void library() throws InterruptedException
	{
		driver.findElement(By.linkText(pr.getProperty("Library"))).click();
		Thread.sleep(7000);
	}
	public void watchlater() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Watchlater"))).click();
		Thread.sleep(7000);
	}
	public void subscriptions() throws InterruptedException
	{
		driver.findElement(By.linkText(pr.getProperty("Subscription"))).click();
		Thread.sleep(7000);
	}
}
