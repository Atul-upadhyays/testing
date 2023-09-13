package com.google.e2e;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MySnapShotlistener implements ITestListener {
	 WebDriver driver ;


	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("--------------Listner calling---------------");
		driver =  (WebDriver) result.getInstance();
		TakesScreenshot takescreenshot = ((TakesScreenshot) driver);

		File source = takescreenshot.getScreenshotAs(OutputType.FILE);

		File target = new File("C:\\Users\\jai mata di\\Pictures\\New folder\\hii.png");

		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
