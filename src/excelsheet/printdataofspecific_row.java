package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printdataofspecific_row 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
	short row1 = sheet.getRow(4).getLastCellNum();
	System.out.println(row1);
	
	for(int i=0;i<row1;i++)
		
	{
	String value = sheet.getRow(4).getCell(i).getStringCellValue();
	System.out.println(value);
	}
	
}
}
