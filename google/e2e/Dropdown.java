package com.google.e2e;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dropdown {
		WebDriver driver;
		WebDriverWait wait;
		
		@Parameters("browserName")
		@BeforeClass
		public void beforeClass(@Optional("chrome") String browserName ) {

//			
//			if(browserName.equalsIgnoreCase("chrome")) {
//				driver = new ChromeDriver(options);
//			}else if(browserName.equalsIgnoreCase("firefox")) {
//				driver = new FirefoxDriver();
//			}else if(browserName.equalsIgnoreCase("edge")) {
//				driver = new EdgeDriver();
//			}
			
			  ChromeOptions options = new ChromeOptions();
			    options.addArguments("--incognito");
			    options.setAcceptInsecureCerts(true);
			    
				/*
				 * EdgeOptions option1 = new EdgeOptions(); 
				 * option1.addArguments("InPrivate");
				 * option1.setAcceptInsecureCerts(true);
				 */
			    
				
				driver = new ChromeDriver(options);
			
			wait = new WebDriverWait(driver , Duration.ofSeconds(5));
			
			driver.get("file:///C:/Users/jai%20mata%20di/AppData/Local/Microsoft/Windows/INetCache/IE/08XB9L36/SelectSite[1].html");
			driver.manage().window().maximize();
						
		}
		
		
		@Test
		public void dropDown() throws InterruptedException{
			WebElement element = driver.findElement(By.name("pets"));
			Select  select = new Select(element);
			select.selectByVisibleText("Cat"); ///prefferby text
			
	         Thread.sleep(3000);
			
			select.selectByValue("parrot");
			
			Thread.sleep(3000);
			
			select.selectByIndex(6);
			
			
		}
		
		@Test
		public void testJSPopUp() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@value='Click me']")).click();
			Thread.sleep(3000);
			
		//	driver.switchTo().alert().sendKeys("rohit");
			driver.switchTo().alert().accept();
			
		}
		@AfterClass
		public void afterClass() {
			driver.close();
		}
		
		
}
