package com.practice;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown {
	
		WebDriver driver;
		
		@BeforeClass
		public void beforeClass() {
			
			driver = new ChromeDriver();
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			option.setAcceptInsecureCerts(false);
			
	           
			driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/#:~:text=Dropdowns%20are%20toggleable%2C%20contextual%20overlays,is%20an%20intentional%20design%20decision.");
		
			driver.manage().window().maximize();
		}
		
		@Test(enabled =false)
		public void dropdown() {
			 
			
			WebElement element = driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]"));
			element.click();												
			  
			
			WebElement a =driver.findElement(By.linkText("Action"));
			a.click();
			System.out.println(a.isEnabled());
			
			WebElement b = driver.findElement(By.linkText("Another action"));
			element.click();
			b.click();
			System.out.println(b.isEnabled());
			WebElement c = driver.findElement(By.linkText("Something else here"));
		
			c.click();
			System.out.println(c.isEnabled());
			
		}
		
	
}
