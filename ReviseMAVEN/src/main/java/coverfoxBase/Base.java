package coverfoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
 static protected WebDriver driver;
	
public void lunchingBrowser() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.get("https://www.coverfox.com/");
	Thread.sleep(2000);
	Reporter.log("lunching browser", true);
}
public void closebrowser() throws InterruptedException
{
	driver.close();
	Thread.sleep(2000);
	Reporter.log("closing browser", true);
}

}
