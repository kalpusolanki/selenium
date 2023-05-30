package webdriver_method;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_attribute {
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kapusolanki");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Lalitkumar@786");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(6000);
Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']")).sendKeys("hii");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	//	driver.manage().window().minimize();
		
		
	}
}
