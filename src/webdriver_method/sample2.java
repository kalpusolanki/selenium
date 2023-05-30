package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args)

{                      //creating instance of ChromeDriver class
	WebDriver driver =new ChromeDriver(); // create object of chromedriver which give output of webdriver
	driver.get("https://www.cricbuzz.com/");  // by calling web driver method we execute it
	
	
	driver.close(); // to close enable tab
	
	driver.quit();  // to close complete chrome browser
	
	//As per the java concept if you create an object using New keyword it will 
	//initiate constructor of that particular class. We have object of ChromeDriver class

//This will create a problem if you want to perform cross browser testing like 
	//writing script for different browsers like Firefox, Edge etc. You will have to
//create another instance of another browser using New keyword like
//Instead we can create reference variable of WebDriver interface and cast it 
	//to browser class as below
	






}
}
