package CoverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverfox_resultscombined {
	@FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement textofmatchingplan;
	@FindBy(id = "plans-list")private List<WebElement>planlist;
		
	public coverfox_resultscombined(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public int resultOfListedPolicy() throws InterruptedException
	{  Thread.sleep(1000);
		String text = textofmatchingplan.getText();
		Thread.sleep(500);
		System.out.println(text);
		String splittext[] = text.split(" ");
		String ar = splittext[0];
		System.out.println(ar);
		int int_totallist = Integer.parseInt(ar);
		System.out.println(int_totallist);
		return int_totallist;



		

	}
	public int bannerresult() throws InterruptedException
	{  Thread.sleep(1000);
		int totallist = planlist.size();
		System.out.println(totallist);
		return totallist;
	}
	
	
	
	
	
	
	
}
