package listbox;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class find_dublicate_occuranceusinghashmap1 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");
	WebElement a1 = driver.findElement(By.xpath("//select[@id='4678']"));
	Select s=new Select(a1);
	List<WebElement> a2 = s.getOptions();
	
	HashMap<String, Integer> hs = new HashMap<String, Integer>();
	for(WebElement a3:a2)
	{
		String a4 = a3.getText();
	
	if(hs.containsKey(a4))
	{
		Integer value = hs.get(a4);
		value++;
		hs.put(a4, value);  // step imp to initialize
	}
	else
		{
		hs.put(a4, 1);
		}
    }
	for(Entry<String, Integer> a6:hs.entrySet())
	{
		System.out.print(a6.getKey()+"   ");
		System.out.println(a6.getValue());
	}
}
}