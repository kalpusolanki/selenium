package webelement;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		
		String result = driver.findElement(By.xpath("//a[text()='Schedule']")).getText();
		
		System.out.println(result);
		
		
		
		
	}

}
