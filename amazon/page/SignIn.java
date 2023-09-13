package com.amazon.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.objectrepositry.objectrepositry;

public class SignIn implements objectrepositry{

	WebDriver driver;
	WebDriverWait wait;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver , Duration.ofSeconds(20));
	}
	

	public void signUp(String name,  String mobile, String emailId, String password) {
		driver.findElement(By.id(SIGNINBUTTON)).click();
		driver.findElement(By.id(CREATEACCOUNTBUTTON)).click();
		
		driver.findElement(By.id(USERNAME)).sendKeys(name);
		driver.findElement(By.id("ap_phone_number")).sendKeys(mobile);
		driver.findElement(By.id("ap_email")).sendKeys(emailId);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("continue")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("home_children_button")));
		
		 driver.findElement(By.className("a-size-large")).getText();
		driver.findElement(By.id("home_children_button")).click();
		
	}
	public void signIn(String username , String password) {
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ap_password")));
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("")).sendKeys(username);
		driver.findElement(By.id("")).click();
	}
	
	
}
