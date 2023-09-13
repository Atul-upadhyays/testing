package com.practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Zoom {
	WebDriver driver;
@Test
	public void ma() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jai mata di\\eclipse-workspace\\mymavenproject\\Driver\\chromedriver.exe" );
		driver = new FirefoxDriver();
//		FirefoxOptions options = new FirefoxOptions();
//		options.setAcceptInsecureCerts(true);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		Thread.sleep(1000);
		WebElement middleFrame = driver.findElement(By.id("iframeResult"));
				driver.switchTo().frame(middleFrame);
//	driver.findElement(By.xpath("//input[@value=\"Click me\"]")).click();
//	Thread.sleep(10000);
//	driver.switchTo().alert().accept();
				
				 
//		WebElement s = driver.findElement(By.id("cars"));
//		Select dropdown =new Select(s);
//		dropdown.selectByVisibleText("Saab");
				
				
//				Actions act = new Actions(driver);
//				act.dragAndDrop(from, to).build().perform();
				
				JavascriptExecutor Js = (JavascriptExecutor)driver;
				Js.executeScript()
				
				
	
}
	}
