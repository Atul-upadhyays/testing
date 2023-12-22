package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestData.FileLocationAndVariables;

public class DriverConfig implements FileLocationAndVariables{
	WebDriver driver;

	public DriverConfig(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver initializeWebDriver(String browsername, String URL) {
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
		switch (browsername) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		// additional cases as needed
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("driver is not initilize");
		}

		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

}
