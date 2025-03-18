package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxaddressdetails_four {
	@FindBy(xpath = "(//input[@type=\"number\"])[1]")private WebElement EnterPincode;
	@FindBy(xpath = "(//input[@type=\"number\"])[2]")private WebElement EnterMobNo;	
	@FindBy(className = "next-btn")private WebElement ContinueButton;
	public 	CoverFoxaddressdetails_four (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void EnterPincodeOnHealth_plan_Page(String pin_no)
	{
		EnterPincode.sendKeys(pin_no);
	}

	public void EnterMobNoOnHealth_plan_Page(String cellno)
	{
		EnterMobNo.sendKeys(cellno);	
	}

	public void ClickOnContinueButton() {
		ContinueButton.click();
	}


}
