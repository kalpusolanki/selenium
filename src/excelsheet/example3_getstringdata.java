package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getstringdata 
{
public static void main(String[] args) throws IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
          String result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(result);
}
}
