package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_getalloption_fromsingleselectedlistbox 
{
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	System.out.println("===========for printing+++++++++++");
	WebElement element = driver.findElement(By.id("day"));
	Select sc =new Select(element);
          List<WebElement> alloption = sc.getOptions();
          for(WebElement a:alloption)
          {
        	  System.out.println(a.getText());
          }
          System.out.println("===for size============");
     int result = sc.getOptions().size();
     System.out.println(result);
     System.out.println("=========for size1=============");
     List<WebElement> b = sc.getOptions();
     int n=b.size();
     System.out.println(n);
}
}
