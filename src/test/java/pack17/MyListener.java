package pack17;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	   System.out.println("on test start");
	  }
	
	public void onTestSucess(ITestResult result) {
		System.out.println("on test success");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	  }
	public void onTestFinished(ITestContext context) {
		System.out.println("on test finished");
	  }

}
