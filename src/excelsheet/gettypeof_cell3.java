package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gettypeof_cell3 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file =new FileInputStream("C:\\\\Users\\\\kalpu\\\\OneDrive\\\\Desktop\\\\KALPESH VELOCITY\\\\Auto\\\\excelex\\\\example1.xlsx");

	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

	CellType typecell = sh.getRow(0).getCell(2).getCellType();
	System.out.println(typecell);
}
}