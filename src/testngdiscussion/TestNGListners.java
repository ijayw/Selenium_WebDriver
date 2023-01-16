package testngdiscussion;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;
import drop_down.test;

public class TestNGListners extends TestCases implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case :"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test case pass:"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed :"+result.getName());
		try {
			ScreenShot.captureScreenshot(driver,result.getName());
		} catch (IOException e) {
			System.out.println("Exception occured in the screenshot code");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test case skipped :"+result.getName());
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("Test tag started:"+context.getName());	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag completed:"+context.getName());		
	}

}
