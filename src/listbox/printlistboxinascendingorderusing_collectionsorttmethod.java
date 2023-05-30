package listbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jakarta.xml.bind.Element;

public class printlistboxinascendingorderusing_collectionsorttmethod
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	Select sc=new Select(driver.findElement(By.xpath("//select[@id='month']")));
	  List<WebElement> web = sc.getOptions();
	  
	  ArrayList<String> s2 = new ArrayList<String>();
	  
	  for( WebElement s3: web)
	  {
		 String s4 =s3.getText();
		 s2.add(s4);
	  }
	  Collections.sort(s2);
	  System.out.println(s2);
}
}
