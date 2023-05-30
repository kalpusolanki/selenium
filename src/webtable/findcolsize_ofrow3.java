package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcolsize_ofrow3 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample1.html");
	// of row 3
	
	int colcell = driver.findElements(By.xpath("//table[@id='1234']//tr[3]//td")).size();
	System.out.println(colcell);
	// of row 1
	int colcell1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]//th")).size();
	System.out.println(colcell1);
}
}
