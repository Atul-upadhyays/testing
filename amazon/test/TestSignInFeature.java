package com.amazon.test;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.page.SignIn;
import com.amazon.util.CommonUtility;
import com.amazon.util.DriverSetup;

public class TestSignInFeature {
	WebDriver driver;
	WebDriverWait wait;
	SignIn signIn;
	CommonUtility cu;
	 DriverSetup  DriverSetup;
	@Parameters("browsername")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browsername) {
		 DriverSetup = new  DriverSetup();
		
		signIn = new SignIn(driver);
		cu = new CommonUtility();
	}
	@Test
	public void testSignUpWithValidData() {
		signIn.signUp("ram", "4545454564", "updiap0026@gmail.com", "ram@12345");
	}
	
	
	
	
}
