package WorkingWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class excel_assignment{
	public int row_count;
	public int column_count;
	public Sheet sheet;
	
	@DataProvider(name="TestData")
	public Object[][] input() throws IOException {
		
		File file=new File("./Test_data/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Data");
		row_count = sheet.getPhysicalNumberOfRows()-1;
		column_count = sheet.getRow(0).getPhysicalNumberOfCells();
		Object obj[][]=new Object[row_count][column_count];
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<column_count;j++) {
				obj[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
	}
	
	
	@Test(dataProvider = "TestData")
	public void data(String email,String password,String signin)  {
		System.out.print(email+" ");
		System.out.println(password);
		System.out.println(signin);
		System.out.println();
	}
	
	
}
