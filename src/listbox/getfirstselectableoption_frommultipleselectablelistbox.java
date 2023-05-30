package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectableoption_frommultipleselectablelistbox 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");
	
	
	Thread.sleep(1000);
	WebElement element =driver.findElement(By.xpath("//select[@id='4678']"));
	Select se =new Select(element);
//	se.selectByIndex(2);
//	se.selectByVisibleText("Aust");
//	se.selectByVisibleText(" nederland");
	
	
	
	System.out.println("========first way============");
	
	String result=se.getFirstSelectedOption().getText();
	System.out.println(result);
	
}
}
