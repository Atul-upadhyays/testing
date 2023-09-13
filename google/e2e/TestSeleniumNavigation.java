package com.google.e2e;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSeleniumNavigation {
	
	WebDriver driver; //ChromeDriver, FirefoxDriver, EdgeDriver
	WebDriverWait wait;
	@Parameters("browsername")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
	}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		wait = new WebDriverWait(driver , Duration.ofSeconds(10));

	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //10sec min 500ms
	}
	
	
	@Test(priority = 0)
	public void testSeleniumSite()   {
		driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		driver.findElement(By.xpath("//h3[text() = 'Selenium']")).click();
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(actualUrl, "https://www.selenium.dev/");
		
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
		
		driver.findElement(By.id("docsearch-input")).sendKeys("Grid");
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mark[text() ='Grid']")));
		driver.findElement(By.xpath("//mark[text() ='Grid']")).click();
	}
	
	@Test(priority = 1)
	public void testNavigation(){
		driver.navigate().back();
		String actualUr = driver.getCurrentUrl();
		assertEquals(actualUr, "https://www.selenium.dev/");
		driver.navigate().forward();
		String actualUrl = driver.getCurrentUrl();
		assertEquals(actualUrl, "https://www.selenium.dev/documentation/grid/");
		
		driver.navigate().refresh();
		String actualU = driver.getCurrentUrl();
		assertEquals(actualU, "https://www.selenium.dev/documentation/grid/");
		driver.navigate().to("https://www.google.com/");
		String actual = driver.getCurrentUrl();
		assertEquals(actual, "https://www.google.com/");
		
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
}
