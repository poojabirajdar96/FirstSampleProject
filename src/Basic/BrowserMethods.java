package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https:\\www.amazon.com");
	    
	    //Navigate Method
	    //driver.navigate.to("https:\\www.amazon.com"); Short way to write code for navigate method
	    Navigation nav = driver.navigate();
	    nav.to("https:\\www.amazon.com");
	    Thread.sleep(3000);
	    nav.back();
	    Thread.sleep(3000);
	    nav.forward();
	    Thread.sleep(3000);
	    nav.refresh();
	    
	    //GetTitle Method
	    String title = driver.getTitle();
	    System.out.println("Title of page = " + title);
	    
	    //GetTitle Method
	    String url = driver.getCurrentUrl();
	    System.out.println("Url of current page = " + url);
	    
	    //Manage method
	   // driver.manage().window().maximize(); short way for manage method 
	    Options opt = driver.manage();
	    Window win = opt.window();
	    win.maximize();
	    Thread.sleep(3000);
	    win.minimize();
	    Thread.sleep(3000);
	    
	    //SetSize method
	    Dimension d = new Dimension(200,700);
	    driver.manage().window().setSize(d);
	    
	    //SetPosition method
	    Point p = new Point(100,300);
	    driver.manage().window().setPosition(p);
	}

}
