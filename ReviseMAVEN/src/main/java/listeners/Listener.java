package listeners;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import coverFoxUtility.UtilityClass;
import coverfoxBase.Base;

public class Listener extends Base implements  ITestListener{
@Override
public void onTestFailure(ITestResult result) {
	try {
		UtilityClass.takeScreenShort(driver,result.getName());
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Reporter.log(result.getName()+" onTestFailure Listner works", true);	
}
@Override
	public void onTestSkipped(ITestResult result) {
	 Reporter.log("onTestSkipped Listner works", true);
	}
@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("onStart Listner works", true);	
	}
@Override
	public void onTestSuccess(ITestResult result) {
	 Reporter.log("onTestSuccess Listner works", true);
	}
@Override
	public void onFinish(ITestContext context) {
	Reporter.log("onFinish Listner works", true);	
	}

}
