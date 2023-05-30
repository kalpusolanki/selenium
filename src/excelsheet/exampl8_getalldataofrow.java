package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exampl8_getalldataofrow 
{
public static void main(String[] args) throws IOException
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet2");
	int number = sheet1.getLastRowNum();

	for(int i=0;i<=number;i++)
	{
		String result = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(result);
	}
}
}