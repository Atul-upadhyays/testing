package com.google.e2e;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pops{
	
	// Types of wait in selenium : implicit and explicit( WebDriverWait) 
	
	WebDriver driver ;
	WebDriverWait wait;
	
	@Parameters("browsername")
	@BeforeClass
	public void beforeClass(@Optional("Chrome") String browsername) {
	
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
	}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // max time : 10 sec , min: 500ms 
		
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // max time : 10 sec , min: 500ms , 5sec--> 10 times

	}
	
	@Test
	public void testIframeSwitching() throws InterruptedException {
		
	WebElement frame = driver.findElement(By.name("callout"));
	driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[@aria-label=\"No thanks\"]")).click();
		
	}
	
	@Test
	public void testNewWindowSwitching() throws InterruptedException {
		
		driver.navigate().to("https://www.guru99.com/alert-popup-handling-selenium.html");
		String parentwin = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@data-lasso-id=\\\"432002\\")).click();
		
		Thread.sleep(2000);
		
		Set<String> winArray =  driver.getWindowHandles();
		winArray.remove(parentwin);
		String childWin = (String)winArray.toArray()[0];
		
		
		driver.switchTo().window(childWin);
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("Selenium123");
//		driver.findElement(By.name("submit")).click();
		driver.close();
		 Thread.sleep(2000);
		driver.switchTo().window(parentwin);
		
	
	
	}
	
	@AfterClass
	public void afterClass() {
		
		driver.close();
	}
	

}