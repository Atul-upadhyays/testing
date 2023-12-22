package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ibm.icu.util.Output;

import TestData.FileLocationAndVariables;
import net.thucydides.model.steps.TestStatus;

public class ScreenShot implements FileLocationAndVariables {
	

	public static void CaptureScreenShot(WebDriver driver ,String FileName) throws IOException {
if(testResult.getStatus() == ITestResult.FAILURE) {
		TakesScreenshot ts = (TakesScreenshot)driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(
				"C:\\Users\\Atul\\git\\repository4\\passiveRefferals\\src\\test\\java\\TEST_OUTPUT\\" + FileName+".png");
		FileUtils.copyFile(sourcefile, destfile);
		}
	}

}