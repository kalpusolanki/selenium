package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class find_celltypethrough_scanner_method 
{
public static void main(String[] args) throws Throwable, IOException


{
	
	int a;
	int b;
	
	Scanner obj = new Scanner(System.in);
	System.out.print("enter row no"  );
		 a=obj.nextInt();
		 
		 if(a>100)
			{
				System.out.println("not valid cell");
			}
			else
			{
			
				System.out.print("enter cell value");
			}
		

			b =obj.nextInt();
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");

Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

CellType typecell = sh.getRow(a).getCell(b).getCellType();
System.out.println(typecell);


}
}
