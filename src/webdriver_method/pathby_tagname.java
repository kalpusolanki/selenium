package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathby_tagname 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\html\\sample2.html");


//enter UN
driver.findElement(By.tagName("input")).sendKeys("1234");

//enter PW
driver.findElement(By.tagName("input")).sendKeys("1432");


//if tag name is same for multiple element in html action performend always in first tagmane, then we find id value
// if if tag name is differnt for multiple element in html then and then we use tagname for locator


}
}
