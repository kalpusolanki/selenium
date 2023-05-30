package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_getcolumnsize 
{


	public static void main(String[] args) throws IOException 
	{
		FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
		short number = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getLastCellNum();
		System.out.println(number);
		


		 
	}
}

