package Selenium_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signUp 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SMproject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createaccount=driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button"));
		createaccount.click();
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("dinga");
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("minga");
		WebElement username=driver.findElement(By.name("reg_email__"));
		username.sendKeys("7020896612");
		WebElement pass=driver.findElement(By.cssSelector("input#password_step_input"));
		pass.sendKeys("Dinga@7");
		WebElement drop=driver.findElement(By.id("day"));
		Select s=new Select(drop);
		s.selectByVisibleText("15");
		Thread.sleep(2000);
		WebElement drop1=driver.findElement(By.id("month"));
		Select s1=new Select(drop1);
		s1.selectByIndex(10);
		Thread.sleep(2000);
		WebElement drop2=driver.findElement(By.id("year"));
		Select s2=new Select(drop2);
		s2.selectByVisibleText("1995");
		WebElement radiobutton=driver.findElement(By.cssSelector("input[value='2'"));
		radiobutton.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//WebElement continue=driver.findElement(By.cssSelector("//*[@id=\"scrollview\"]/div/div/div[1]/div/div[3]/div[1]/div[2]/span"))
		WebElement conti=driver.findElement(By.xpath("//*[@id=\"scrollview\"]/div/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div"));
		conti.click();
		
	}
}
