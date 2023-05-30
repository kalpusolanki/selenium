package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pointtable

{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/cricket-series/5945/indian-premier-league-2023/points-table");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[4]/div[1]/table/tbody/tr[5]/td[1]/a/div/div[2]")).click();


}
}
