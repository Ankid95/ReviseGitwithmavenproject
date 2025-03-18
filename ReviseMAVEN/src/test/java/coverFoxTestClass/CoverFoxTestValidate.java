package coverFoxTestClass;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CoverFoxPOM.CoverFoxHomePage_one;
import CoverFoxPOM.CoverFoxaddressdetails_four;
import CoverFoxPOM.CoverFoxmemberdetailspage_three;
import CoverFoxPOM.CoverfoxhealthplanPage_two;
import CoverFoxPOM.coverfox_resultscombined;
import coverFoxUtility.UtilityClass;
import coverfoxBase.Base;

@Listeners(listeners.Listener.class)

public class CoverFoxTestValidate extends Base{
	public static Logger logger;
  CoverFoxHomePage_one home;
  CoverfoxhealthplanPage_two healthpaln ;
  CoverFoxmemberdetailspage_three memberdetails ;
  CoverFoxaddressdetails_four adressdetails;
  coverfox_resultscombined result;
	
  @BeforeClass
	public void lunchingbrowser() throws InterruptedException
	{
	 logger=logger.getLogger("CoverFoxLogger") ;
	  PropertyConfigurator.configure("log4j.properties");
	  
	  lunchingBrowser();
	  logger.info("lunching coverfox");
	  home=new CoverFoxHomePage_one(driver);
	  healthpaln =new CoverfoxhealthplanPage_two(driver);
	  memberdetails= new CoverFoxmemberdetailspage_three(driver);
	  adressdetails =new CoverFoxaddressdetails_four(driver);
	  result =new coverfox_resultscombined(driver);
	  Reporter.log("lunching browser through TESTNG",true);
	}
	
  @BeforeMethod
	public void entermemberdetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
	  Reporter.log("clickingon genderbutton 1st page",true);
	  home.ClickOnGetStartedButton();
	  logger.error("loggerprintMass");
	  Thread.sleep(9000);
	  healthpaln.clickonnextbutton();
	  Reporter.log("clickingon clickonnextbutton 2nd page",true);
	  Thread.sleep(9000);
	  memberdetails.clickonselectage(UtilityClass.readdatafrompropertifile("age"));
	  Thread.sleep(9000);
	  memberdetails.clickonNextbuttononmemberpage();
	  Reporter.log("clickingon clickonNextbutton on 3rd page",true);
	  Thread.sleep(9000);
	  adressdetails.EnterPincodeOnHealth_plan_Page(UtilityClass.readdatafrompropertifile("pincode"));
	  Reporter.log("EnteringPincode page 4",true);
	  Thread.sleep(9000);
	  adressdetails.EnterMobNoOnHealth_plan_Page(UtilityClass.readdatafrompropertifile("mobno"));
	  Reporter.log("EnteringMobNo page 4",true);
	  Thread.sleep(9000);
	  adressdetails.ClickOnContinueButton();
	  Reporter.log("ClickOnContinueButton page 4",true);
	  Thread.sleep(9000);
	}
	
	
	
	
	
	
	@Test
  public void validateTestpalanfromTestAndBanner() throws InterruptedException {
		int testresult = result.resultOfListedPolicy();
		Thread.sleep(8000);
		int bannerre = result.bannerresult();
		Thread.sleep(8000);
		 SoftAssert s=new SoftAssert();
	      
		 s.assertNotEquals(testresult,bannerre,"result met tc failed");
  Reporter.log("tc is pass",true);
  s.assertAll();
	}
	@AfterMethod
	public void closingall() throws InterruptedException
	{
		closebrowser();
		Reporter.log("close it from test as well");
	}
	
}
