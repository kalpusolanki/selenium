package handlingof_multiplewebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.sbimf.com/");
	driver.findElement(By.xpath("//p[contains(text(),'Invest for long term goals (5+ years)')]")).click();
	driver.findElement(By.xpath("//div[@id='dvRiskRating']")).click();
	
//	List<WebElement> obj = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	for(WebElement s1:obj)
//	{
//	s1.click();
//	}
//	
//	for(int i=7;i<=10;i++)
//	{
//		obj.get(i).click();
//	}
	
}
}
