package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class colour_compare_usingcssvalue 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
//	String a1 = driver.findElement(By.xpath("//a[.='API Documentation']")).getCssValue("color");
//			System.out.println(a1);
//			String a2 = driver.findElement(By.xpath("//a[.='API Documentation']")).getCssValue("background-color");
//			System.out.println(a2);
			
			
	String a1 = driver.findElement(By.xpath("//a[.='API Documentation']")).getCssValue("color");
	 String a3 = Color.fromString(a1).asHex();
			 System.out.println(a3);
	 
	 String a2 = driver.findElement(By.xpath("//a[.='API Documentation']")).getCssValue("background-color");
	String a4 = Color.fromString(a2).asHex();
	System.out.println(a4);
			
}
}
