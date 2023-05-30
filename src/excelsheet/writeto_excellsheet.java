package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeto_excellsheet 
{
public static void main(String[] args) throws IllegalStateException, IOException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();

	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	String a1 = driver.getTitle();
	
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\excelex\\example1.xlsx");
	WorkbookFactory.create(file).getSheet("Sheet3").createRow(1).createCell(1).setCellValue(a1);
}
}
