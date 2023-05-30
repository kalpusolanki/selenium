package popup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles_gettext_sizeofwindows_close
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.naukri.com/");
	List<WebElement> a4 = driver.findElements(By.xpath("//a[@class=\"ntc__chip-wrapper\"]"));
	for(WebElement a5:a4)
	{
		a5.click();
		Thread.sleep(4000);
	}
	
	Set<String> a1 = driver.getWindowHandles();
	// fot total count
	int count = a1.size();
	System.out.println(count);
	
	// for total id of chilbrowser windows
	for(String a2:a1)
	{
		Thread.sleep(4000);
		driver.switchTo().window(a2);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}
	driver.quit();
}
}
