package org.botShreyasi.passiveRefferals;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestData.FileLocationAndVariables;
import TestData.datapro;
import pages.AppPage;
import utilities.DriverConfig;
import utilities.ScreenShot;
import utilities.excelSheet;



public class AppTest implements FileLocationAndVariables {

	WebDriver driver;
	WebDriverWait wait;
	DriverConfig driverConfig;
	AppPage a;
	Logger l;
	excelSheet es;

	@Parameters(value = "browsernames")
	@BeforeClass
	public void driverSet(String browsernames) {

		// Initialize DriverConfig within the @BeforeClass method
		driverConfig = new DriverConfig(driver);
		driver = driverConfig.initializeWebDriver(browsernames, webUrl );
		a = new AppPage(driver);
		l = LogManager.getLogger("AppTest");
		es = new excelSheet(driver);
	}

	// test method
	@Test(dataProviderClass = datapro.class, dataProvider = "sea", invocationCount = 2)
	public void at(String m, String n) throws InterruptedException {

		try {
			ScreenShot.CaptureScreenShot(driver ,"login");
			Thread.sleep(2000);
			l.info("this is selenium searching method");
			a.ap(m, n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//  @Test 
//	public void Successful_Login() {
//		
//	}
//	
//	@Test 
//	public void Invalid_Password() {
//		
//	}
//	
//	@Test 
//	public void Empty_Username_Field() {
//		
//	}
//	@Test 
//	public void Empty_Password_Field() {
//		
//	}
//	@Test 
//	public void Username_with_Special_Characters() {
//		
//	}
//	@Test 
//	public void Locked_Account() {
//		
//	}
//	@Test 
//	public void Remember_Me_Option() {
//		
//	}
//	@Test 
//	public void Multi_Factor_Authentication(){
//		
//	}	
//	@Test 
//	public void Password_Reset_Request() {
//		
//	}
//	@Test 
//	public void Account_Recovery_Request() {
//		
//	}

	@AfterClass
	public void tearDown() {
		l.info("now driver quit");
		driver.quit();
	}
}
