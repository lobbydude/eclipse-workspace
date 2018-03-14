package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
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
	
	  @Override		
	    public void onFinish(ITestContext Result) 					
	    {		
	                		
	    }		
	 
	    @Override		
	    public void onStart(ITestContext Result)					
	    {		
	            		
	    }		
	 
	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		
	 
	    // When Test case get failed, this method is called.		
	    @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    System.out.println("The name of the testcase failed is :"+Result.getName());					
	    }		
	 
	    // When Test case get Skipped, this method is called.		
	    @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
	    }		
			
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	   					
	    }		
	 
	    // When Test case get passed, this method is called.		
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase passed is :"+Result.getName());					
	    }		
	    
	    

}
