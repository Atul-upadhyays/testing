package com.practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown2 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.setAcceptInsecureCerts(false);
		
           
		driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/#:~:text=A%20classic%20dropdown%20is%20a,with%20elements%20inside.&text=The%20best%20way%20to%20interact,option%20you%20want%20to%20choose.");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropDown() {
		WebElement element = driver.findElement(By.id("pets"));
		
		Select s = new Select(element);
		s.selectByVisibleText("Cat");
		s.selectByValue("dog");
		s.selectByIndex(2);
		
	}
}
