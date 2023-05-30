package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex10_printalltupeofdataofrow_usingloop 
{
public static void main(String[] args) throws IOException
{
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\kalpu\\\\OneDrive\\\\Desktop\\\\KALPESH VELOCITY\\\\Auto\\\\excelex\\\\example1.xlsx");
           Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
             int rowindex = sh.getLastRowNum();

for(int i=0;i<=rowindex;i++)
{
 CellType s1 = sh.getRow(i).getCell(0).getCellType();
			
			if(s1== CellType.STRING)
			{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
					System.out.println(value);
			}
			else if (s1== CellType.NUMERIC)
			{
				double value = sh.getRow(i).getCell(0).getNumericCellValue();
				System.out.println(value);
			}
	
			else if (s1== CellType.BOOLEAN)
			{
			 boolean value = sh.getRow(i).getCell(0).getBooleanCellValue();
					 System.out.println(value); 
			}

	
	}
             
             
             
             
}
}
