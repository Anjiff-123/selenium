

package WorkingWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WorkingWithExcelData {
	@Test
	public void demo() throws EncryptedDocumentException, IOException {
		//define the path
		File file=new File("./Test_data/TestData.xlsx");
		
		//Access the TestData File
		
		Workbook book=WorkbookFactory.create(file);
		
		//Access the required sheet
		Sheet sheet = book.getSheet("Data");
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
}
