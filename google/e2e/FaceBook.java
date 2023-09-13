package com.google.e2e;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBook {
	WebDriver driver;
	

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fb() {
		driver.findElement(By.name("q")).sendKeys("Facebook" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[text() = \"Facebook - log in or sign up\"]")).click();
		
	}
	
	

	
	
	
}
