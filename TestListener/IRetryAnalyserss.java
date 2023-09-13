package TestListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyserss implements IRetryAnalyzer{
	int max = 3;
	int min =0;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
			
		}
		return false;
	}
}
