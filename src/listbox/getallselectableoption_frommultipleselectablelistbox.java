package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectableoption_frommultipleselectablelistbox 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");


	// select multiple option from list box
		

	WebElement country =driver.findElement(By.xpath("//select[@id='4678']"));

	Select se =new Select(country);
	se.selectByIndex(1);
	se.selectByVisibleText("Aust 	");
	
//     Select result = new Select((WebElement) driver.findElements(By.xpath("//select[@id='4678']")));
     List<WebElement> n =se.getAllSelectedOptions();
     
     for(WebElement s1:n)
     {
    	 System.out.println(s1.getText());
     }
     System.out.println("====================================");
     String s2=se.getFirstSelectedOption().getText();
     System.out.println(s2);
     
     System.out.println("============= 1 st way ==================");
     System.out.println(n.size());
     
     System.out.println("============= 2nd way ==================");
     int b=se.getAllSelectedOptions().size();
     System.out.println(b);
	}

}
