package TestListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Isuitelistener implements ISuiteListener {
@Override
public void onStart(ISuite suite) {
System.out.println("hiiiiiiiiiiiiiiiiii");
}
}
