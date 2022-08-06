package Selenium_Actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupJunit 
{
	ChromeDriver driver;
	@Before
	public void openBrowser()
	{
		driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void signup() throws InterruptedException
	{
		driver.findElement(By.xpath("(//a[contains(@id,'u_')])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Ringa");
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Swami");
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("matkarswapnil123");
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("matkarswapnil123");
		Thread.sleep(2000);
		WebElement drop=driver.findElement(By.xpath("//*[@id='day' and @name='birthday_day']"));
		Select s=new Select(drop);
		s.selectByVisibleText("25");
		Thread.sleep(2000);
		WebElement drop1=driver.findElement(By.xpath("//*[@id='month']"));
		Select s1=new Select(drop1);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		WebElement drop2=driver.findElement(By.xpath("//*[@id='year']"));
		Select s2=new Select(drop2);
		s2.selectByValue("1995");
		driver.findElement(By.xpath("(//*[contains(@id,'u_')])[30]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit' and @name='websubmit']")).click();
	}
	@After
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Closing browser");
		//driver.close();
	}
}
