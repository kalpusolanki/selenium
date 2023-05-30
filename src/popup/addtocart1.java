package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart1 
{

	 public static void main(String[] args) throws InterruptedException
	 {

	 WebDriver driver=new ChromeDriver();

	 driver.get("https://www.flipkart.com/");

	 driver.manage().window().maximize();

	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("(//img[@class=\"_396cs4\"])[4]"));
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("(//a[contains(@href,'https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera&fm=neo%2')])[1]")).click();

	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']")).click();

	
	
	
	
	
	
}
}
