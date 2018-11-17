package selenium.september;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AmazonApplication {
public static void main (String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	/* System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();*/
	
    

	Thread.sleep(3000);	 
	driver.get("https://www.amazon.in/");
/*	Thread.sleep(3000);	 
	 driver.findElement(By.xpath("//*[contains(text(),'Try')]")).click();
	 
	 driver.findElement(By.xpath("//*[contains(text(),'join Prime')]")).click();
	 
	 driver.findElement(By.id("ap_email")).sendKeys("9840604339");
	 
	 driver.findElement(By.id("continue")).click();*/

	 
	 System.out.println(driver.getCurrentUrl());
	 String value = driver.findElement(By.xpath("(//*[contains(@href,'prime?ref=nav')])[2]")).getAttribute("id");
	 System.out.println(value);
	 driver.findElement(By.xpath("(//*[contains(@href,'prime?ref=nav')])[2]")).isDisplayed();
	 
	 driver.quit();
	 
}
}