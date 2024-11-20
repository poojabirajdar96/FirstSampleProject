package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice2 {
	public static void main(String args[]) throws InterruptedException {
		 WebDriver obj1=AutomationPractice.launchBrowser("https:\\www.instagram.com");
		 obj1.manage().window().maximize();
		 Thread.sleep(3000);
		 obj1.manage().window().minimize();
	}
}
