package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_totalofeachrow_is_same 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample1.html");
 List<WebElement> a1 = driver.findElements(By.xpath("//tr//td[3]"));
 WebElement a2 = driver.findElement(By.xpath("//tr[5]/td[3]"));
   						
 int sum=0;
 int sum1=0;

	for(WebElement a3:a1)
	{
		 String a4 = a3.getText();
		sum+=Integer.parseInt(a4);
//	System.out.println(a4);
	}
sum1=Integer.parseUnsignedInt(a2.getText());
if(sum-sum1==sum1)
{
	System.out.println("total is correct");

}
else
{
	System.out.println("incorrect");}
}

//System.out.println(sum);
//System.out.println(sum1);
}
