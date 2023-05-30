package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example3 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.sugarcosmetics.com/products/face-fwd-corrector-stick?currency=INR&variant=40537542230099&utm_medium=cpc&utm_source=google&utm_campaign=Google%20Shopping&utm_source=google&utm_medium=search&utm_campaign=17185724877&adgroupid=&utm_content=&utm_term=&gclid=EAIaIQobChMIyNfPuITt_gIVR18PAh1vpAukEAEYASABEgIfj_D_BwE");
	
	String rs = RandomString.make(2);
	
	File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\scshot\\img"+rs+".jpg");
	FileHandler.copy(sc, dest);
}
}
