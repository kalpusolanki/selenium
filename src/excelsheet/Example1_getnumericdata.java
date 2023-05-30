package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getnumericdata
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	//firstway
	
//	FileInputStream file=new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\selenium.xlsx");
//	Workbook book=WorkbookFactory.create(file);
//	           Sheet sheet = book.getSheet("Sheet1");
//	                     Row rw = sheet.getRow(0);
//	                          Cell result = rw.getCell(0);
//	                       String text = result.getStringCellValue();
//	                       System.out.println(text);
	                       
	                       System.out.println("=========2 nd way================");
	                       FileInputStream file=new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	                double result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	                  System.out.println(result);
	                 
	                    		   
}
}
