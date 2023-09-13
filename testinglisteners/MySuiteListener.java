package testinglisteners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener{
@Override
public void onStart(ISuite suite) {
	// TODO Auto-generated method stub
System.out.println("Capturing OS version , browser version and userdetails to displays in html report");
}
}
