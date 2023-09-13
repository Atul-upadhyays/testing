package com.amazon.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.util.CommonUtility;
import com.amazon.util.DriverSetup;

public class TestProductSearch {
	WebDriver driver;
	WebDriverWait wait;
	com.amazon.page.ProductSearch ProductSearch;
	DriverSetup DriverSet;
	
	@Parameters("browsername")
	@BeforeClass
	public void beforeClass(@Optional("chrome")  String browsername) {
		DriverSet = new DriverSetup() ;
		driver = DriverSet.initializeWebDriver(browsername);
		ProductSearch  = new com.amazon.page.ProductSearch(driver);
		
		
	}
	@Test
	public void testDefaultSearch() {
		
		ProductSearch.defaultSearch("jio mobile");
		String displaycount = driver.findElement(By.xpath("//span[contains(text() , 'results for ')]")).getText().substring(2,4);
		Dimension resultCount = driver.findElement(By.xpath("//h2/a")).getSize();
		assertEquals(String.valueOf(resultCount) , displaycount);
		
	}
	
	
}
