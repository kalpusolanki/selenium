package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exampl7_getalldataofcell 
{
public static void main(String[] args) throws IOException
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet2");
	int index = sheet1.getRow(0).getLastCellNum()-1;

	for(int i=0;i<=index;i++)
	{
		String value = sheet1.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value + "  ");
	}
}
}
