package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	
	/*Method to launch Chrome browser*/
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\Continuum Data\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");		
	}
	
	/*Method to launch Firefox browser*/
	public static void launchMozilaBrowser() {
		System.setProperty("webdriver.gecko.driver","E:\\Continuum Data\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

	public static void launchAmazonWeb(){
		launchMozilaBrowser();
		driver.get("https://www.amazon.in/");
		
	}
	
}
	
	
