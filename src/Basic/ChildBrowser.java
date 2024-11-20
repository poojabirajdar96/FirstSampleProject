package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.naukri.com/");
		//String handle = driver.getWindowHandle();//Return only main page id

		WebElement remote = driver.findElement(By.xpath("//span[@title='Remote']"));
		remote.click();
		
		WebElement mnc = driver.findElement(By.xpath("//span[@title='MNC']"));
		mnc.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> i = handles.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		while(i.hasNext()) {
			String handle = i.next();
			Thread.sleep(5000);
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			if(title.contains("Mnc")) {
				System.out.println("Switched to mnc");
			}
			System.out.println(title);
		}
		
	}
	
}
