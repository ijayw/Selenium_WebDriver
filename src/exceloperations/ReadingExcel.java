package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	public static void main(String[] args) throws Exception {
		
		String path = System.getProperty("user.dir")+"\\facebook.xlsx";
		
		FileInputStream input = new FileInputStream(path);
		
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheetAt(0);
		
//		using for loop
		
		int rows = sheet.getLastRowNum();
		
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.getCell(c);
				
				switch (cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
			   System.out.print(" | ");
				
			}
			System.out.println();
		}

}
}