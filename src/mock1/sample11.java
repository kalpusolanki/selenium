package mock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.myperfectresume.com/lp/mprrwzlp03.aspx?utm_source=google&utm_medium=sem&utm_campaign=203478382&utm_term=myperfectresume&network=g&device=c&adposition=&adgroupid=10709827222&gclid=CjwKCAjw1MajBhAcEiwAagW9MZKVyQNaE7dURFw7796aMxBGEkIKf19VOojL_fw1XeBlCONJev2BAxoCYmIQAvD_BwE");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement a1 = driver.findElement(By.xpath("//a[.='Build My Resume']"));

((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", a1);
Thread.sleep(2000);
a1.click();

String a4 = driver.getTitle();
System.out.println(a4);




}
}
