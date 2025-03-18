package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import coverfoxBase.Base;

public class UtilityClass extends Base{

	public static String readExcelData(int row,int cell) throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("readingExcelData", true);
FileInputStream myfile= new FileInputStream(System.getProperty("user.dir")+"src\\test\\resources\\Eclipstestcasesdata.xlsx");
Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
	}
public static void takeScreenShort(WebDriver driver,String filename) throws IOException, InterruptedException
{   Thread.sleep(500);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\selenium screenshort//filename.png");
	FileHandler.copy(source, dest);
	Reporter.log("takeingScreenShort", true);
}

public static void wait(WebDriver driver,int time) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	Thread.sleep(2000);
	Reporter.log("wating", true);
}
	
public static void scrolling(WebDriver driver,WebElement element) throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
	Thread.sleep(2000);
	Reporter.log("scrolling", true);
}
	
public static String readdatafrompropertifile(String key) throws IOException
{
	Properties p=new Properties();
	FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"\\CoverFoxproperty.properties");
	p.load(myfile);
	String value = p.getProperty(key);
	return value;
}
	
	
	
	
	
}
