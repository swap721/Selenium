package DifferentTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		List<WebElement> Ls=driver.findElements(By.id("video-title"));
		System.out.println("total videos "+Ls.size());
		Ls.get(3).click();
		Thread.sleep(3000);
		driver.navigate().back();
		for(WebElement el: Ls)
		{
			el.click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
	}
}
