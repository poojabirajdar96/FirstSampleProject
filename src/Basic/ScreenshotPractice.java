package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice {
  public static void clickScreenshot(WebDriver driver, String name) throws IOException {
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destination = new File("C:\\Users\\Administrator\\Pictures\\Screenshots\\"+name+".png");
	  FileHandler.copy(source, destination);
  }
}
