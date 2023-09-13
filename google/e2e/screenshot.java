package com.google.e2e;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class screenshot {
		WebDriver driver;
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911442121038&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_2nwj9de76o_e");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("snapshot/Amazn.png");
		FileUtils.copyFile(sourcefile, destfile);
		
		
		
	}

}