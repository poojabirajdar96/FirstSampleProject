package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUse {
	public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://corporate.olacabs.com/login");
	     driver.manage().window().maximize();
	     
	     //Find element using name attribute
	     WebElement email = driver.findElement(By.name("username"));
	     email.sendKeys("abcd@gmail.com");
	     WebElement password = driver.findElement(By.name("password"));
	     password.sendKeys("123489");
	     
	     //Find element using className attribute
	     WebElement submitBtn = driver.findElement(By.className("signup-btn"));
	     //submitBtn.click();
	     
	     //Find element using partialLinkText
	     WebElement  clickHereTxt= driver.findElement(By.partialLinkText("Click Here"));
	    // clickHereTxt.click();
	     
	   //Find element using linkText
	     WebElement LoginWithOtpTxt = driver.findElement(By.linkText("Log in with OTP"));
	    // LoginWithOtpTxt.click();
	     
	   
	     
	   //Find element using tagName
	    // WebElement loginBtn = driver.findElement(By.tagName("button"));
	    // loginBtn.click();
	     
	   //Find element using xpath by attribute
	     WebElement olaCorporateLogo = driver.findElement(By.xpath("(//div[@class='corp-logo'][1])"));
	     olaCorporateLogo.click();
	     
	   //Find element using xpath by text with index
	    // WebElement help = driver.findElement(By.xpath("(//a[text()='Help'][1])"));
	    // help.click();
	     
	     //Find element using xpath by contains with index
	     WebElement quickStartGuide = driver.findElement(By.xpath("(//a[contains(@href,'page_id=2')][1])"));
	     System.out.println(quickStartGuide);
	     quickStartGuide.click();
	     
	     
	    }
}
