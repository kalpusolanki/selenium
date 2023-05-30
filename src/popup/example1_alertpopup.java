package popup;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_alertpopup
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	driver.findElement(By.name("submit")).click();
	//1. getting text
	System.out.println(driver.switchTo().alert().getText());
	//2. click close button
//	driver.switchTo().alert().dismiss();
	//3. ok button click
	
	driver.switchTo().alert().accept();
	
	//4.get text of second popup
	
	System.out.println(driver.switchTo().alert().getText());
	
	//5. click ok button
	driver.switchTo().alert().accept();
	
	
}
}
