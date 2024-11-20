package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    return driver;
	}
	 public static void main(String args[]) {
		 launchBrowser("https:\\www.instagram.com");
	 }
}
