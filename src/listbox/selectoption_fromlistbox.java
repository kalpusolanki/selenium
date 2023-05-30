package listbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectoption_fromlistbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kalpesh");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("solanki");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8888545933");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("hanuman");
		Thread.sleep(2000);
		Select se =new Select(driver.findElement(By.id("day")));
//		se.selectByValue("25");   // string
//		se.selectByIndex(12);          // index
		se.selectByVisibleText("24"); // string
//		Thread.sleep(2000);
//		Select sc=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
//		sc.selectByValue("6");
//		Thread.sleep(2000);
//		Select sy=new Select(driver.findElement(By.xpath("//select[@id='year']")));
//		sy.selectByValue("2019");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		
//driver.quit();
}
}