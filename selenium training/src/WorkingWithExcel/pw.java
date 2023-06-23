package WorkingWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class pw {
	@Test
	public void demo1() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Data");
		String value = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		
		//row count
		int row_count = sheet.getPhysicalNumberOfRows();
		System.out.println(row_count);
		
		//column count
		int column_count = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(column_count);
	}
}
