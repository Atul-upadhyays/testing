package TestData;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;


public class datapro implements FileLocationAndVariables {
	//this is for login page 
	static WebDriver driver;
	public static utilities.excelSheet excelSheet = new utilities.excelSheet(driver);
	@DataProvider(name = "sea")
	public static Object[][] searchData() throws Exception {
		String filepath = LOGINFILEDATA;
		int cell = excelSheet.cellCount(filepath, "Sheet1"); // 1
		int row = excelSheet.rowCount(filepath, "Sheet1"); // 5
		Object s[][] = new Object[row - 1][cell]; // before this i return a string and it show null exception error
		try {
			for (int i = 1; i < row; i++) {
				for (int j = 0; j < cell; j++) {
					s[i - 1][j] = excelSheet.excel(filepath, "Sheet1", i, j); // Assuming you want data from the first
																				// column
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			
		
	}
		return s;
	}
}
