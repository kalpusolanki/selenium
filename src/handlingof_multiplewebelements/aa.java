package handlingof_multiplewebelements;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aa 
{
public static void main(String[] args) throws InterruptedException 

{
WebDriverManager.chromedriver().setup();
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sbimf.com/");
	Thread.sleep(4000);
	// clicking long term goals
	driver.findElement(By.xpath("//p[contains(text(),'Invest for long term goals (5+ years)')]")).click();
	
	driver.findElement(By.xpath("//div[@id='dvRiskRating']")).click();
	
	
	// for change focus
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://www.sbimf.com/mutual-fund/equity-mutual-funds");
	Thread.sleep(5000);
	driver.navigate().refresh();
//	
	driver.findElement(By.xpath("//*[@id=\"dvRiskRating\"]/div[1]/label")).click();
	Thread.sleep(3000);
	List<WebElement> obj = driver.findElements(By.xpath("//*[@id=\"dvRiskRating\"]/div/label"));
	


	for(WebElement obj1:obj)
	{
		Thread.sleep(4000);	
	obj1.click();
	Thread.sleep(100);
	}
	
//	for(int i=0;i<=5;i++)
//	{
//		driver.findElement(By.xpath("//*[@id=\"dvRiskRating\"]/div[1]/label")).click();
//	}
//	
	// its also done programe without chrome manager but pt is to refresh if, we refresh again without that method its also run
}
}
