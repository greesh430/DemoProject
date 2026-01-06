package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer  //IRetryAnalyzer & ITestResult is an interface by testng

{
	int counter = 0; 
	int retryLimit = 2; 
	 
	public boolean retry(ITestResult result) { //invoke when testcase fails, result is an interface variable

		if(counter < retryLimit) 
		{ 
			counter++;    //can re-execute
			return true; 
		} 
		return false;    //stops execution
}
	
}
