package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login 
{
	public ChromeDriver driver;
	public Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Signin(String user, String password) throws InterruptedException
	{
		WebElement login=driver.findElement(By.xpath(pr.getProperty("Signin")));login.click();
		WebElement userid=driver.findElement(By.xpath(pr.getProperty("Idtext"))); userid.sendKeys(user);
		Actions ac=new Actions(driver);
		/*
		 * for(int i=0;i<=2;i++) { ac.sendKeys(Keys.TAB).perform();Thread.sleep(700); }
		 */
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(7000);
		WebElement pwd=driver.findElement(By.xpath(pr.getProperty("Pwdtext"))); pwd.sendKeys(password);Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(7000);
	}
}
