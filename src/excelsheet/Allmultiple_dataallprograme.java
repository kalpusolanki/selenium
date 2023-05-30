package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Allmultiple_dataallprograme 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\kalpu\\\\OneDrive\\\\Desktop\\\\KALPESH VELOCITY\\\\Auto\\\\excelex\\\\example1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
           int rowindex = sh.getLastRowNum();
for(int i=0;i<=rowindex ;i++)
{
	int cellindex = sh.getRow(i).getLastCellNum()-1;
	
	for(int j=0;j<=cellindex;j++)
	{
		CellType type = sh.getRow(i).getCell(j).getCellType();
		if(type==CellType.STRING)
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"   ");
		}
		else if (type==CellType.NUMERIC) 
		{
			double value = sh.getRow(i).getCell(j).getNumericCellValue();
			System.out.print(value+"   ");
		}
		else if (type==CellType.BOOLEAN) 
		{
			boolean value = sh.getRow(i).getCell(j).getBooleanCellValue();
			System.out.print(value+"   ");
		}
	
	}
	System.out.println();
	}


}
}
