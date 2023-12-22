package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import TestData.locator;

public class AppPage implements locator {
	WebDriver driver;

	public AppPage(WebDriver driver) {
		this.driver = driver;

	}

	public void ap(String a, String b) throws InterruptedException {
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STABLECLICK)));
		driver.findElement(By.id(USER_ID)).sendKeys(a + Keys.ENTER);

		driver.findElement(By.xpath(PASSWORD)).sendKeys(b + Keys.ENTER);

		driver.findElement(By.xpath(CAPTCHA)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(LOGIN)).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

//	public void Successful_Login() {
//		
//	}
//	
//	
//	public void Invalid_Password() {
//		
//	}
//	
//	
//	public void Empty_Username_Field() {
//		
//	}
//	 
//	public void Empty_Password_Field() {
//		
//	}
//	
//	public void Username_with_Special_Characters() {
//		
//	}
//	
//	public void Locked_Account() {
//		
//	}
//	
//	public void Remember_Me_Option() {
//		
//	}
//	
//	public void Multi_Factor_Authentication(){
//		
//	}	
//	
//	public void Password_Reset_Request() {
//		
//	}
//	 
//	public void Account_Recovery_Request() {
//		
//	}
}
