package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getrowsize 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	int number = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
	System.out.println(number);
}
}
