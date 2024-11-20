package Basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
  public static void main(String args[]) {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Downloads\\msedgedriver.exe");
      WebDriver driver = new EdgeDriver();
      driver.get("https:\\www.facebook.com");
      
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver1 = new ChromeDriver();
      driver1.get("https:\\www.amazon.com");
  }
}
