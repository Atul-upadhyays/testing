package utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;


public class excelSheet {

	WebDriver driver;

	public excelSheet(WebDriver driver) {
		this.driver = driver;
	}

	public static XSSFWorkbook wb;
	public static XSSFSheet st;
	public static XSSFRow rw;
	public static XSSFCell cl;
	public static FileInputStream finput;

	public static String excel(String filepath, String SheetName, int rowss, int cellss) throws Exception {

		File ExcelFile = new File(filepath);

		finput = new FileInputStream(ExcelFile);
		wb = new XSSFWorkbook(finput);
		st = wb.getSheet(SheetName);
		cl = wb.getSheet(SheetName).getRow(rowss).getCell(cellss);

		return cl.getStringCellValue();

	}

	public static int rowCount(String filepath, String SheetName) throws Exception {
		File ExcelFile = new File(filepath);

		finput = new FileInputStream(ExcelFile);
		wb = new XSSFWorkbook(finput);

		st = wb.getSheet(SheetName);
		int rowc = st.getLastRowNum() + 1;
		wb.close();
		return rowc;
	}

	public static int cellCount(String filepath, String SheetName) throws Exception {

		File ExcelFile = new File(filepath);
		finput = new FileInputStream(ExcelFile);
		wb = new XSSFWorkbook(finput);

		st = wb.getSheet(SheetName);
		int cellc = st.getRow(0).getLastCellNum();
		wb.close();
		return cellc;

	}
	

}