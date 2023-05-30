package listbox;

import java.awt.List;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.zeromq.ZStar.Set;

public class find_dublicate_occuranceusinghashmap
{
public static void main(String[] args)
{		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");
			WebElement list = driver.findElement(By.xpath("//select[@id='4678']"));
			Select s = new Select(list);
			java.util.List<WebElement> allElements = s.getOptions();
			HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
			for (WebElement element : allElements)
			{
			String text = element.getText();
			if (hashMapObj.containsKey(text)) {
			Integer value = hashMapObj.get(text);
			value++;
			hashMapObj.put(text, value);
			}else{
			hashMapObj.put(text, 1);
			}
			}
		 java.util.Set<String> allKeys = hashMapObj.keySet();
			for (String key : allKeys) {
			Integer value = hashMapObj.get(key);
			System.out.println(key +" -->"+ value);
			if (value>1) {
			System.out.println("Occurance of " + key + " is :" + value);
			}
		}
	}
}

