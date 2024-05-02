package Day32;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx"); 
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet();
		
		XSSFRow row1= sheet.createRow(0);
		
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("1234");
		row1.createCell(2).setCellValue("xyz");
		
		XSSFRow row2= sheet.createRow(1);
		
		row2.createCell(0).setCellValue("abc");
		row2.createCell(1).setCellValue("4536");
		row2.createCell(2).setCellValue("testing");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("writing is done");
	}

}
