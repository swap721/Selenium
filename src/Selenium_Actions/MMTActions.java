package Selenium_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		Thread.sleep(2000);
		WebElement  drop=driver.findElement(By.xpath("//*[@type='text' and @class='react-autosuggest__input react-autosuggest__input--open']")); 
		drop.click();
		Actions ac=new Actions(driver);
		for(int i=0;i<=7;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		ac.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@type='text' and @class='react-autosuggest__input react-autosuggest__input--open']")).click();
		for (int j=0;j<=5;j++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(500);
		for(int j=0;j<=2;j++)
		{
			ac.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1500);
		}
		ac.sendKeys(Keys.ENTER).perform();
		//ac.sendKeys(Keys.TAB).perform();
	}
}
