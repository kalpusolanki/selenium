package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class else_ifbytypecellcelltypeinfo 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	Cell celltype = sh.getRow(0).getCell(2);
   	CellType s1 = celltype.getCellType();
   	
   	if(s1==CellType.STRING)
   	{
   		String value = celltype.getStringCellValue();
   		System.out.println(value);
   	}
   	else if(s1==CellType.NUMERIC)
   	{
		double value = celltype.getNumericCellValue();
		System.out.println(value);
	}
   	else if (s1==CellType.BOOLEAN) 
   	{
		boolean value = celltype.getBooleanCellValue();
		System.out.println(value);
	}




}
}
