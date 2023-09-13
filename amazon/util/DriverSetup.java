package com.amazon.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup {
	WebDriver driver;
	WebDriverWait wait;

	public WebDriver initializeWebDriver( String browsername) {
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		return driver;
	}
}
