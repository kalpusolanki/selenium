package listbox;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printlistboxinascendingorderusing_teesetmethod
{
public static <E> void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	Select sc=new Select(driver.findElement(By.xpath("//select[@id='month']")));
	List<WebElement> option = sc.getOptions();
	TreeSet ts = new TreeSet();
	// to store data/elements
	for(WebElement s:option)
	{
	
		String s1 = s.getText();
		ts.add(s1);
	}
	// for print the data/elements
	Iterator it =ts.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	}
}
