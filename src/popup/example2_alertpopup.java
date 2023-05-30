package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertpopup 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	driver.findElement(By.name("submit")).click();
	
	// want to switch one time no need to switch again and again for operATION
	
	 Alert alt = driver.switchTo().alert();
	 
//	 alt.dismiss();
	 System.out.println(alt.getText());
	 alt.accept();
	 System.out.println(alt.getText());
	 alt.accept();
	 
	 
	 
	 
}
}
