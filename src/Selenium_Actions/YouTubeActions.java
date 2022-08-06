package Selenium_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class YouTubeActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
		
		String firsttab= driver.getWindowHandle();
		 java.util.Set<String> alltabs= driver.getWindowHandles();
		 System.out.println("total tabs "+alltabs.size());
		 System.out.println("before switching url "+driver.getCurrentUrl());
		
		 for(String s:alltabs)
		 {
			 driver.switchTo().window(s);
			 Thread.sleep(1000);
			 if(driver.getCurrentUrl().equals("http://www.youtube.com"))
			 {
				 break; //it will move outside the loop
			 }
		 }
		 //int p=0;
		/* for(String s:alltabs)
		 {
			 p=p+1;
			 if(p==2)
			 {
				 driver.switchTo().window(s);
				 break;
			 }
			 		
		 }*/
		 System.out.println("after switching url "+driver.getCurrentUrl());
		 driver.switchTo().window(firsttab);
		 System.out.println("Final Url "+driver.getCurrentUrl());
		
	}
}
