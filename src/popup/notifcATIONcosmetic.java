package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notifcATIONcosmetic 
{
public static void main(String[] args)
{
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver =new ChromeDriver(option);
	driver.get("https://in.sugarcosmetics.com/products/mousse-muse-maskproof-lip-cream?utm_source=google&utm_medium=search&utm_campaign=17164953316&adgroupid=137460700025&utm_content=657279243573&utm_term=sugar%20cosmetica&gad=1&gclid=CjwKCAjw36GjBhAkEiwAKwIWyVu2fCI13gHFufQtVeCugkZoxcIz90JZmbdJMhfM9rhgv_LW2inxuhoCBFkQAvD_BwE");
}
}
