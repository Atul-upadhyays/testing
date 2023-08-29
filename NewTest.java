package com.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
//	drag and drop%
//	scroll%
//	screenshot%
//	navigate%
//	wait%
//	get window handle
//	listener
//	radio
//	checkbox
//	table
//  broken url check
//	tooltip  check
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void f() throws InterruptedException {
	  driver = new FirefoxDriver();
	  
	  driver.get("https://jqueryui.com/draggable/");
	  wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
//	  WebElement iframe = driver.findElement(By.className("demo-frame"));
//	  driver.switchTo().frame(iframe);
//	  
//	  WebElement source = driver.findElement(By.id("draggable"));
//	  WebElement target = driver.findElement(By.id("droppable"));
//	  Actions a = new Actions(driver);
//	  a.dragAndDropBy(source, 50, 250).build().perform();
	  
	  
	  
//	JavascriptExecutor j = (JavascriptExecutor) driver;
//	j.executeScript("window.scrollBy(0,250)", "");
	  
//	  TakesScreenshot sc = ((TakesScreenshot) driver);
//	  File s = sc.getScreenshotAs(OutputType.FILE);
//	  File target = new File("snapshot/B.png");
//	 
//		try {
//			
//			FileUtils.copyFile(s, target);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	  
	  
//	  driver.navigate().to("https://www.linkedin.com");
//	  Thread.sleep(3000);
//	  driver.navigate().refresh();
//	  Thread.sleep(3000);
//	  driver.navigate().back();
//	  Thread.sleep(3000);
//	  driver.navigate().forward();
//	  Thread.sleep(3000);
//	  driver.quit();
	  
//	  wait
//	  implecit - Instead of halting the program till the specified time is reached, Implicit wait will wait for all the web elements dynamically
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
//	  explicit -Instead of waiting for all the statements in the program, Explicit wait will wait only for the specific web element
	 //Fluent Wait is a type of wait command in Selenium that allows testers to wait for an element to meet certain conditions before proceeding with the test script.
	 
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	  
	  
	
  }
}
