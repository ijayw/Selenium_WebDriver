package exceloperations;

import java.io.IOException;

import Utility.ExcelReader;

public class PrintDataExcel {
	
public static void main(String[] args) throws IOException {
//	WAP to print the data of whole excel sheet in console
	    ExcelReader er = new ExcelReader();
 
		for(int i = 0;i<=21;i++)
		{
			for(int j = 0;j<1;j++)
			{
				String value = er.readData(i,j);
			}
			System.out.println();
		}
		System.out.println("************");
		
		for(int i = 0;i<=21;i++)
		{
			for(int j = 1;j<=1;j++)
			{
				String value = er.readData(i,j);
			}
			System.out.println();
		}
}
}




//