package handlingsearchbox;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
 java.util.List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String expText="redmi note 10";
		System.out.println(allOptions.size());
		
		for(WebElement s1: allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}	
	}

}
