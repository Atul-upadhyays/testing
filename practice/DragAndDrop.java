package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
WebDriver driver;
@BeforeClass
public void beforeClass() {
	driver = new ChromeDriver();

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--incognito");
	option.setAcceptInsecureCerts(false);
	
       
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	
}
		
			@Test(enabled = false)
			public void dD() throws InterruptedException {
				WebElement element = driver.findElement(By.className("demo-frame"));
				
				driver.switchTo().frame(element);
				WebElement from =driver.findElement(By.id("draggable"));
				
				Actions act = new Actions(driver);
				act.dragAndDropBy(from, 10, 50).build().perform();;
				Thread.sleep(1000);
				driver.navigate().to("https://jqueryui.com/droppable/");
	WebElement elemen = driver.findElement(By.className("demo-frame"));
				
				driver.switchTo().frame(elemen);
				WebElement fro =driver.findElement(By.id("draggable"));
				WebElement to =driver.findElement(By.id("droppable"));
				act.dragAndDrop(fro, to).build().perform();
				
			}
			@Test(enabled = false)
			public void testSelectable() {
				
				driver.findElement(By.linkText("Selectable")).click();
				WebElement frame = driver.findElement(By.className("demo-frame"));
				driver.switchTo().frame(frame);
				
				
				
				WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
				WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
				WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
				
				Actions action = new Actions(driver);
				
				// Press Key ctl + Click2 +Click4 +Click6
				
				action.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).build().perform();
					
			}
			@Test
			public void testMenu(){
				
				driver.findElement(By.linkText("Menu")).click();
				WebElement frame = driver.findElement(By.className("demo-frame"));
				driver.switchTo().frame(frame);
				
				
				WebElement mainmenu = driver.findElement(By.id("ui-id-9"));
				WebElement submenu = driver.findElement(By.id("ui-id-13"));
				WebElement category = driver.findElement(By.id("ui-id-16"));
				
				Actions action = new Actions(driver);
				
				action.moveToElement(mainmenu).pause(Duration.ofSeconds(2))
				.moveToElement(submenu).pause(Duration.ofSeconds(3)).click(category).build().perform();
						
				
				
				
				
			}



}
