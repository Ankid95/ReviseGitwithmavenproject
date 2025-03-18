package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage_one {
//@FindBy(xpath = "//input[@type=\"tel\"]")private  WebElement enterphoneno;
@FindBy(xpath = "//button[@title=\"Get Started\"]")private WebElement GetStartedbutton;


public CoverFoxHomePage_one (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
//public void EnterMobileNo() 
//{
//	enterphoneno.sendKeys("8888888888");	
//}

public void ClickOnGetStartedButton()
{ 
	GetStartedbutton.click();
}	
	
	
	
	
}
