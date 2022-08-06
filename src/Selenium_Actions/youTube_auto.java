package Selenium_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTube_auto {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[yt-simple-endpoint style-scope ytd-button-renderer")).click();
		
	}

}
