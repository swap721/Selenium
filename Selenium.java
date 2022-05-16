package pkg1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		Thread.sleep(2000);
		w.minimize();
		
	}
}
