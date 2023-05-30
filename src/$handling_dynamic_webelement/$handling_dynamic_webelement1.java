package $handling_dynamic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class $handling_dynamic_webelement1 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// enter value in search box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("oppo mobile");
		// search button enter
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//get rating
		WebElement rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
		System.out.println(rating.getText());
	}
}
