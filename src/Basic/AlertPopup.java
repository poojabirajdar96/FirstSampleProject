package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = AutomationPractice.launchBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsAlert.click();
		System.out.println("Clicked on Js Alert");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Clicked on Js Confirm");
		
	}
}
