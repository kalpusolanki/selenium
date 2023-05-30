package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class allprintdata1 
{
public static void main(String[] args) throws IllegalStateException, IOException 
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
    Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
 
    int rowindex = sheet.getLastRowNum();
    
    
    for(int i=0;i<=rowindex;i++)
    {
    	   int indexcell = sheet.getRow(i).getLastCellNum()-1;
    	for(int j=0;j<=indexcell;j++)
    	{
    		String value = sheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(value+"    ");
    	}
    	System.out.println();
    }
}
}
