package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printalldata_inexelrowandcolumn 
{
public static void main(String[] args) throws IOException, Exception 
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
       Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
       short n = sheet.getRow(4).getLastCellNum();
       System.out.println(n);
       
       
       
       int count=0;
       
       for(int i=0;i<=count;i++)   // i increases every time
       {
    	  
    	   for(int j=0;j<=sheet.getRow(i).getLastCellNum()-1;j++)
    	   {
    		   String result = sheet.getRow(i).getCell(j).getStringCellValue();
    		   System.out.print(result+ "  ");
    		  
    	   }
    	   System.out.println();
    	 count++;
       }
}
}
