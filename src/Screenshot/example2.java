package Screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.input.RandomAccessFileInputStream;
import org.apache.pdfbox.io.RandomAccessFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example2 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String rs = RandomString.make(02);
	
                 File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                 
                 
                 File dest= new File("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\scshot\\img"+rs+".jpg");
                 FileHandler.copy(sc, dest);
}
}
