package com.amazon.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.objectrepositry.objectrepositry;

public class ProductSearch implements objectrepositry {

	WebDriver driver;
	WebDriverWait wait;
	
	public ProductSearch(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver , Duration.ofSeconds(40));
	}
	
	public void defaultSearch(String productname) {
		String selecttype = driver.findElement(By.id(SELECTTYPE)).getText(); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contain(text() , "+productname+") ]")));
		driver.findElement(By.xpath("//span[contain(text() , \"+productname+\") ]"));
	}
	
	public void SearchCategory(String category , String productname) {
		Select selectCategory = new Select(driver.findElement(By.id("nav-search-label-id")));
		selectCategory.deselectByVisibleText(category);
		driver.findElement(By.id(SELECTTYPE)).getText(); 
		driver.findElement(By.id(SEARCHBAR)).sendKeys(productname);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contain(text() , "+productname+") ]")));
		driver.findElement(By.xpath("//span[contain(text() , \"+productname+\") ]"));
	}
}
