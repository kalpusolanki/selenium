package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chech_duplicate_items 
{// USING FIND ELEMENT  in select we use only find element
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");
	// here we take find element important step
 WebElement a1 = driver.findElement(By.xpath("//select[@id='4678']"));
	
	Select s =new Select(a1);
	List<WebElement> a3 = s.getOptions();
	int a2 = a3.size();
	System.out.println(a2);

	TreeSet ts =new TreeSet();
	
	for(int i=0;i<a2;i++)
	{
		String a4 = a3.get(i).getText();
		ts.add(a4);
	}
	
	int a5 = ts.size();
	System.out.println(a5);
	if(a5==a2)
	{
		System.out.println("no having duplicate");
	}
	else
	{
		System.out.println("having duplicate");
	}
	
 }
}
