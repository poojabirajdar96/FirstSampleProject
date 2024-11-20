package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void alertMethod(WebDriver driver) throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
	}
	public static void main(String args[]) throws InterruptedException {
	WebDriver driver = AutomationPractice.launchBrowser("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions actions = new Actions(driver);
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement edit= driver.findElement(By.xpath("//span[text()='Edit']"));
	edit.click();
	alertMethod(driver);
	
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement cut= driver.findElement(By.xpath("//span[text()='Cut']"));
	cut.click();
	alertMethod(driver);
	
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement copy= driver.findElement(By.xpath("//span[text()='Copy']"));
	copy.click();
	alertMethod(driver);
	
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement paste= driver.findElement(By.xpath("//span[text()='Paste']"));
	paste.click();
	alertMethod(driver);
	
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement delete= driver.findElement(By.xpath("//span[text()='Delete']"));
	delete.click();
	alertMethod(driver);
	
	actions.contextClick(rightClick);
	actions.perform();
	
	WebElement quit= driver.findElement(By.xpath("//span[text()='Quit']"));
	quit.click();
	alertMethod(driver);
	
	WebElement doubleClick= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	actions.doubleClick(doubleClick);
	actions.perform();
	alertMethod(driver);
	}
}
