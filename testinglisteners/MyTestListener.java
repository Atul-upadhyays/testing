package testinglisteners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getMethod() +"take screenshot when test case fail");
}
}
