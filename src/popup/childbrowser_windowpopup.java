package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_windowpopup 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// click on new tab from webpage
	
	driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();

	
	// get child window id
	Set<String> allid = driver.getWindowHandles();  // mainpage id
	ArrayList<String> id1=new ArrayList<String>(allid);//mainpage id[0],chilwindowid[1]
	
//	
//	Iterator it = id1.iterator();
//	
//			while(it.hasNext())
//				
//			{
//				System.out.println(it.next());
//			}
	
	//switch to child window
	driver.switchTo().window(id1.get(1));
	
	//click on youtube link from child window
	driver.findElement(By.xpath("(//a[contains(@class,'mini-contacts')])[1]")).click();
	// click to subscribe hiddenpopup
	driver.findElement(By.xpath("//a[@aria-label='Subscribe']")).click();
	
	// navigate back button from google mail site.
	
	driver.navigate().back();
//	driver.close();
	// navigate to home page
	driver.switchTo().window(id1.get(0));
	
	// click on second child popup of home screen
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
	//get id again of second child window
	Set<String> allid1 = driver.getWindowHandles();
	ArrayList<String> id2=new ArrayList<String>(allid1);
	

	Iterator it = id2.iterator();
	
			while(it.hasNext())
				
			{
				System.out.println(it.next());
			}
	
	//switch to second child window
	Thread.sleep(2000);
	driver.switchTo().window(id2.get(2));
	Thread.sleep(2000);
	driver.manage().window().minimize();
	
	// process of window handle
	// it depens on how many child window open and switch according to index
	// if some child window close the there index id also reduced dron string object of arraylist and select accordingly required index
	
}
}
