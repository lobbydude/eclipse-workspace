package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase passed is :"+Result.getName());	
		
	}

	
	
	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase failed is :"+Result.getName());	
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		
		
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
