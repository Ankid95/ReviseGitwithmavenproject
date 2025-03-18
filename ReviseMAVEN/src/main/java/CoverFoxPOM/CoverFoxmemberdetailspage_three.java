package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxmemberdetailspage_three  {

	@FindBy(id = "Age-You")private WebElement selectage;
	//@FindBy(id = "Age-Spouse")private WebElement selectageSpouse;
@FindBy(xpath = "//div[@class=\"next-btn\"]")private WebElement nextbuttononmemberpage;
	
	public CoverFoxmemberdetailspage_three (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 public void clickonselectage(String age)
	 {
	 Select s=new Select(selectage);
	 s.selectByValue(age+"y");
	 }
//	 public void selectageSpouse()
//	 {
//	 Select s=new Select(selectage);
//	 s.selectByValue("86y");
//	 }
	 public void clickonNextbuttononmemberpage()
		{
			nextbuttononmemberpage.click();
		}
	
	
}
