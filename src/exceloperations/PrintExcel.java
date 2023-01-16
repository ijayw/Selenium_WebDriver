package exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//WAP to print the data of whole excel sheet
public class PrintExcel {
   public static void main(String[] args) throws IOException {

	    String path = "book.xlsx";
	    File f= new File(path);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("20AugBatch");
		int noofrows = sheet.getLastRowNum();
		int noofcol = sheet.getRow(0).getLastCellNum();
//		for(int i = 0;i<=noofrows;i++)
//		{
//			for(int j = 0;j<noofcol;j++)
//			{
//				String value = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.print(value+"  ");
//			}
//			System.out.println();
//		}
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(value+"  ");
	   
	   
	   
	   
}

}
