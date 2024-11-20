package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukriPagePractice {
	public static void main(String args[]) throws IOException {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	
		WebElement name = driver.findElement(By.xpath("(//input[@id='name'])"));
	    name.sendKeys("Pooja Gavkare");
	    
	    WebElement email = driver.findElement(By.xpath("(//input[@id='email'])"));
	    email.sendKeys("Pooja@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("(//input[@id='password'])"));
	    password.sendKeys("abc@12");
	    password.clear();
	    
	    WebElement mobile = driver.findElement(By.xpath("(//input[@id='mobile'])"));
	    mobile.sendKeys("11111111111");
	    
	    WebElement workStatusExp = driver.findElement(By.xpath("(//div[@tabindex='0'][1])"));
	    workStatusExp.click();
	    System.out.println(workStatusExp.isSelected());
	    
	    //WebElement workStatusFresher = driver.findElement(By.xpath("(//div[@tabindex='0'][2])"));
	    //workStatusFresher.click();
	    //boolean status = workStatusFresher.isSelected();
	    //System.out.println(status);
	    
	    WebElement expBoxTxt = driver.findElement(By.xpath("(//p[@class='main-2'][1])"));
	    expBoxTxt.getText();
	    System.out.println(expBoxTxt.getText());
	    
	    WebElement uploadBtn = driver.findElement(By.xpath("(//button[contains(@class,'uploadResume')])"));
	    uploadBtn.click();
	    
	    WebElement notificationCheckbox = driver.findElement(By.xpath("(//div[@class='formField'][3])"));
	    notificationCheckbox.click();
	    
	    WebElement registerNowBtn = driver.findElement(By.xpath("(//button[text()='Register now'])"));
	    registerNowBtn.click();
	    System.out.println(registerNowBtn.isEnabled());
	    
	    ScreenshotPractice.clickScreenshot(driver, "Test");
	    //WebElement currentCity = driver.findElement(By.xpath("(//input[@name='currentCity'])"));
	    //System.out.println(currentCity.isDisplayed());
	    
	}
}
