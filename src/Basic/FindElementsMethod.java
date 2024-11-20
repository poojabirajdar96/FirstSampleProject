package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FindElementsMethod {
   public static void main(String args[]) throws InterruptedException {
	   WebDriver driver=AutomationPractice.launchBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	   
	   WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	   driver.switchTo().frame(iframe);
	   
	   List<WebElement> images = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	   
	   WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
	   
	   WebElement gallery=driver.findElement(By.xpath("//ul[@id='gallery']"));
	   
	   Actions actions = new Actions(driver);
	   
	   for(int i = 0; i<images.size();i++) {
		   Thread.sleep(2000);
		   actions.dragAndDrop(images.get(i),trash );
		   actions.perform();
	   }
	   
	   for(int i = 0; i<images.size();i++) {
		   Thread.sleep(2000);
		   actions.dragAndDrop(images.get(i),gallery );
		   actions.perform();
	   }
   }
}
