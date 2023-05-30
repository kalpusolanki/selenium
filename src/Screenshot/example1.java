package Screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.xml.security.stax.impl.OutputProcessorChainImpl;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example1 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/automorphic-number-program-in-java");
	
	String rs=RandomString.make(2);
	
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(scr);
	//driverobjectconvetrd into takescreeshot interface downcasting
	
	File dest=new File("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\scshot\\img"+rs+".jpg");
	FileHandler.copy(scr, dest);

}
}
