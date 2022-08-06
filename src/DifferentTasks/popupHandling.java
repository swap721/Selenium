package DifferentTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupHandling 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	Alert al=driver.switchTo().alert();
	al.accept();
	al.dismiss();
	al.getText();
	al.sendKeys("Swapnilm");
}
}
