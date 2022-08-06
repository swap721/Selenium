package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Video 
{
	public ChromeDriver driver;
	public Properties pr;
	public Video(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void playvideo() throws InterruptedException
	{
		driver.findElement(By.id(pr.getProperty("Playvideo"))).click();
		Thread.sleep(7000);
	}
	public void like() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Like"))).click();Thread.sleep(2000);
	}
	public void subscribe() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Subscribe"))).click();Thread.sleep(2000);
	}
	public void comment() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();Thread.sleep(2000);
		WebElement comment=driver.findElement(By.cssSelector(pr.getProperty("Comment")));
		Thread.sleep(2000);
		ac.moveToElement(comment).click();
		ac.sendKeys("commented").perform();Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Commentbutton"))).click(); Thread.sleep(1000);
	}
}
