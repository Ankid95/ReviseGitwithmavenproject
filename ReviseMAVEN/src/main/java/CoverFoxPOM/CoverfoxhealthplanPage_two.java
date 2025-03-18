package CoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxhealthplanPage_two {
@FindBy(xpath = "//div[@class=\"next-btn\"]")private WebElement nextbtn;
	
public CoverfoxhealthplanPage_two(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickonnextbutton()
{
	nextbtn.click();
}	
	
	
	
	
	
	
}
