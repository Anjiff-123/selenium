package WorkingWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ToPrintRowValues {
	@Test
	public void printelements() throws EncryptedDocumentException, IOException {
		File file=new File("./Test_data/TestData.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Data");
		int row_count = sheet.getPhysicalNumberOfRows();
		int column_count = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<column_count;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}
}
