package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePractice {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = AutomationPractice.launchBrowser("https://demo.automationtesting.in/Frames.html");
	    WebElement innerIframeBtn = driver.findElement(By.xpath("(//a[@href='#Multiple'])"));                                                        
	    innerIframeBtn.click();
		
	    WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
	    driver.switchTo().frame(outerFrame);
	    
	    WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
	    driver.switchTo().frame(innerFrame);
	    
	    WebElement inputField = driver.findElement(By.xpath("//input[@type = 'text']"));
	    inputField.sendKeys("abcdefgh");
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    
	    //driver.switchTo().defaultContent();
	    WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
	    home.click();
	}
	
}

