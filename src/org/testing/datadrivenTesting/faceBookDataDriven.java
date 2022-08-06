package org.testing.datadrivenTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class faceBookDataDriven extends facebookData
{
	@Test(dataProvider = "dp2")
	public void login(String s1,String s2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		//List<WebElement> Ls=driver.findElements(By.id("video-title"));
		WebElement user=driver.findElement(By.xpath("//*[@id='email']"));
		user.clear();
		user.sendKeys(s1);
		Thread.sleep(2000);
		WebElement pass =driver.findElement(By.xpath("//*[@id='pass']"));
		pass.clear();
		pass.sendKeys(s2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1500);
		
		String exp="https://www.facebook.com/";
		
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			WebElement profile=driver.findElement(By.cssSelector("svg[class='pzggbiyp']"));
			profile.click();Thread.sleep(3000);
			WebElement logout=driver.findElement(By.cssSelector("div[data-nocookies='true']"));
			logout.click();Thread.sleep(3000);
		}
		else
		{
			driver.navigate().back();
		}
		WebElement number=driver.findElement(By.name("input[class='uiLinkButtonInput']"));
		number.click();
	}
}
