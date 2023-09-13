package com.google.e2e;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ToolTipsTestValidationBrokenUrlVariRestAssured {
	WebDriver driver ;
	WebDriverWait wait;
	
	@Parameters("browsername")
	@BeforeClass
	public void beforeClass(@Optional("edge") String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // max time : 10 sec , min: 500ms 
		
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // max time : 10 sec , min: 500ms , 5sec--> 10 times
	    
	}
	
	@Test
	public void toolTip() {
		String tooltip = driver.findElement(By.className("gb_d")).getAttribute("aria-label");
		
		assertEquals(tooltip, "Google apps");
		
	    String actualtext = driver.findElement(By.id("SIvCob")).getText();
		
	    assertEquals(actualtext, "Google offered in: हिन्दी বাংলা తెలుగు मराठी தமிழ் ગુજરાતી ಕನ್ನಡ മലയാളം ਪੰਜਾਬੀ");
	
	}
	@Test
	public void testBrokenUrl() {
		
		List<WebElement> aurls = driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : aurls) {
		  String url = webElement.getAttribute("href");
		  
		  Response response = RestAssured.get(url);
		  
		  if(response.getStatusCode() < 400) {
			  System.out.println("Url is correct: "+ url);  
		  }else {
			  System.out.println("Url is broken : "+ url);  

		  }
		  
		  
		}
		
		
	}
	
}
