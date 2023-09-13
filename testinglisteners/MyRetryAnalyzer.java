package testinglisteners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
int maxretry = 3;
int counter =0; 
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
	if(counter< maxretry) {
		
		counter++;
		return true;
	}
	return false;
	}

}
