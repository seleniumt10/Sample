package selenium.september;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSearch {
	public static void main (String args[])
	{
		 /*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();*/
		 
		 System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			caps.setCapability("ignoreZoomSetting", true);
			WebDriver driver = new InternetExplorerDriver(caps);  
			driver.manage().window().maximize();
		 
		 driver.get("https://www.google.co.in");
		 WebElement ele = driver.findElement(By.id("lst-ib"));
				 ele.sendKeys("Automation");
				 ele.sendKeys(Keys.ENTER);
		 
		 driver.navigate().back();
		 WebElement ele1 = driver.findElement(By.name("q"));
				 ele1.sendKeys("Automation");
				 ele1.sendKeys(Keys.ENTER);

		 driver.navigate().back();
		 WebElement ele2 =driver.findElement(By.className("gsfi"));
				 ele2.sendKeys("Automation");
				 ele2.sendKeys(Keys.ENTER);

		 driver.navigate().back();
	}

}
