package Day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	//File-->Workbook-->Sheets-->Rows-->Cells
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("ECLIPSE_HOME\\..\\..\\..\\Downloads\\Copy of data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");  //workbook.getSheetAt(0);
		
      int totalrows= sheet.getLastRowNum();
      
      int totalcells= sheet.getRow(1).getLastCellNum();
      
      System.out.println("No of rows: " +totalrows);  // 5
      System.out.println("No of columns: "+totalcells); //4
      
      for(int r=0;r<=totalrows;r++)
      {
    	  XSSFRow currentRow= sheet.getRow(r);
    	  for(int c=0;c<totalcells;c++)
    	  {
    		  XSSFCell cell=currentRow.getCell(c);
    		  String value= cell.toString();
    		  
    		  currentRow.getCell(c).toString();
    		  
    		  System.out.print(value+"  ");
    	  }
    	  System.out.println();
      }
      workbook.close();
      file.close();
	}

}
