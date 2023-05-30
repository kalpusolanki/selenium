package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_printalltupeofdataofcell_usingloop 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\kalpu\\\\OneDrive\\\\Desktop\\\\KALPESH VELOCITY\\\\Auto\\\\excelex\\\\example1.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
    
  int celltype = sh.getRow(0).getLastCellNum()-1;
   
   for(int i=0;i<=celltype;i++)
   {
	 Cell n1 = sh.getRow(0).getCell(i);
	 CellType result = n1.getCellType();
	   if(result==CellType.STRING)
	   {
		   String value = n1.getStringCellValue();
			System.out.print(value +"  ");
	   }
	   else if (result==CellType.NUMERIC) 
	   {
		   double value = n1.getNumericCellValue();
			System.out.print(value+ "   ");
	   }
	   else if (result==CellType.BOOLEAN) 
	   {
		   boolean value = n1.getBooleanCellValue();
			 System.out.print(value+ "   "); 
	   }
   }
    
}
}
