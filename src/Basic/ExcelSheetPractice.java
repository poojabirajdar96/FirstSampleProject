package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetPractice {
	
	public static String getExcelSheetData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Book1.xlsx");	
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static double getIntExcelSheetData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Book1.xlsx");	
	    double value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		return value;
	}

}
