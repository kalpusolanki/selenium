package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_convrtintostring 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	 String value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	//convet int ot string value using " ' before integer "
}
