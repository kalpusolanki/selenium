package webdriver_method;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains_usingtextandattribute 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver= new ChromeDriver();
			driver.navigate().to("https://www.cricbuzz.com/");
			
			Thread.sleep(4000);
			
			// xpath by contains attribute
			driver.manage().window().maximize();
//			Thread.sleep(1000);
			//contains text
			driver.findElement(By.xpath("//div[contains(@title,'27th Match ')]")).click();
//			Thread.sleep(1000);
			// contains text
			driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.cricbuzz.com/cricket-series/5945/indian-premier-league-2023/points-table");
		Thread.sleep(1000);
			//contains text
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[4]/div[1]/table/tbody/tr[5]/td[1]/a/div/div[2]")).click();
			//
			Thread.sleep(4000);
			
			// contains attribute
			driver.findElement(By.xpath("//a[contains(@title,'Team Players')]")).click();
			Thread.sleep(4000);
			
			// xpath by attribute
			driver.findElement(By.xpath("//a[@id='match-dropdown']")).click();
			Thread.sleep(4000);
			
			//xpath by text
			driver.findElement(By.xpath("//span[text()='Tanzania Women vs Kenya Women']")).click();
			Thread.sleep(4000);
			
			driver.navigate().to("https://mail.google.com/");
			Thread.sleep(4000);
			
			driver.navigate().back();
			Thread.sleep(4000);
			
			driver.navigate().forward();
			Thread.sleep(4000);
			
			driver.navigate().refresh();
			Thread.sleep(4000);
			
			driver.close();
//			
}
}
