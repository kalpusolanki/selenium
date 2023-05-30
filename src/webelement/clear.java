package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear
{
public static void main(String[] args) throws InterruptedException 
{   // aproch of webelement
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
//	//UN
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
//	
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//input[@id='email']")).clear(); // return void
//	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xuz");
	
	// perform action and find address again and again so kindly find address one time only and save it to web elemnt and multiple action perform


WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
UN.sendKeys("abc");
Thread.sleep(2000);
UN.clear();
Thread.sleep(2000);
UN.sendKeys("xuz");






}
}
