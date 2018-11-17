package selenium.september;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class Facebook_Login 
{
    public static void main( String[] args ) throws InterruptedException
    {
        // Create object of HashMap Class
        Map<String, Object> prefs = new HashMap<String, Object>();      
        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);
        // Create object of ChromeOption class
         ChromeOptions options = new ChromeOptions();
        // Set the experimental option
         options.setExperimentalOption("prefs", prefs);
        // pass the options object in Chrome driver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");	
    	driver.findElement(By.id("email")).sendKeys("facebookuser2810@gmail.com");
    	//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test");
    	driver.findElement(By.id("pass")).sendKeys("Test@123");
    	driver.findElement(By.id("loginbutton")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.id("userNavigationLabel")).click();
    	driver.findElement(By.xpath("//*[contains(@data-gt,'menu_logout')]//a")).click();    	
    	driver.quit();    	
    }
}
