package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice {

	public static void main(String args[]) {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.naukri.com/");
		try {
		  WebElement gotItBtn = driver.findElement(By.xpath("//span[@class='acceptance-btn-text']"));
		  gotItBtn.click();
		  System.out.println("Got it button clicked");
		}
		catch(Exception e) {
			System.out.println("Got it button not found");
		}
		WebElement acreBtn = driver.findElement(By.xpath("//a[@title = '99acres.com']"));
		acreBtn.click();
	}
}
