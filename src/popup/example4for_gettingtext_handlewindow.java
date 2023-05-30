package popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4for_gettingtext_handlewindow 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	// click new window
	driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
	
	// collect seperate ids
	String Hp = driver.getWindowHandle();
	Set<String> Nw = driver.getWindowHandles();
	ArrayList<String> id=new ArrayList<String>(Nw);
	
	// here we will chech the child window has next child window and get text from child window
	Iterator<String>it=id.iterator();
	while(it.hasNext())
	{
		String obj =  it.next();
//		System.out.println(obj);
		// not work due to 404 exception not authority from API, authentication problem thats why we only get title
		// getwindow handle use for comparison
		if(!Hp.equalsIgnoreCase(obj))
		{driver.switchTo().window(obj);
		
		driver.manage().window().maximize();
		String obj3 = driver.getTitle();
		System.out.println(obj3);
//			String obj1 = driver.findElement(By.xpath("//div[@claass='page-title-head hgroup']")).getText();
//		System.out.println(obj1);
		}
	}
	driver.close();
}
}
