package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class country_capital 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	// //tr//input[@type='checkbox']  
	//   //tr[]//td[5]     column
	//    //tr
	
	// for no of rows
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> row = driver.findElements(By.xpath("//tr"));
			int norow = row.size();
	
	// for column
			List<WebElement> col = driver.findElements(By.xpath("//tr[1]//td"));
			int nocol = col.size();
			
			String s1="//tr[";
			String s2="]//td[";
			String s3="]";
			String s5="]//input[@type='checkbox']";
		WebElement check = driver.findElement(By.xpath("//tr//input[@type='checkbox']"));
	//(//tr)[1]//input[@type='checkbox']
		
			
			for(int i=1;i<=norow;i++)
			{

				for(int j=1;j<=nocol;j++)
				{
				
					
						String a1=s1+i+s2+j+s3;
					String a2 = driver.findElement(By.xpath(a1)).getText();
					System.out.print(a2+"   ");
					
				}
				try 
				{
					String S6=s1+i+s5;
					WebElement n1 = driver.findElement(By.xpath(S6));
				n1.click();
				}
				catch(Exception e)
				{
				System.out.println("handled");
				}
				System.out.println();
			}
	
	
	
	
	
	
	
}
}
