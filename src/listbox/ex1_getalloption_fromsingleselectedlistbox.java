package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_getalloption_fromsingleselectedlistbox
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	System.out.println("===========first way===========");
	Select se =new Select(driver.findElement(By.id("day")));
	se.selectByValue("25");   // string
	se.selectByIndex(12);          // index
	se.selectByVisibleText("24");
	
	System.out.println(se.getOptions().size());
	
	for(WebElement n:se.getOptions())
	{
		System.out.println(n.getText());
	}
}
}
