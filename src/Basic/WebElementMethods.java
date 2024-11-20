package Basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {
	public static void main(String args[]) throws InterruptedException, EncryptedDocumentException, IOException {
		//  Facebook Page
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/r.php");
		String name=ExcelSheetPractice.getExcelSheetData("TestData", 0, 0);
		WebElement firstname = driver.findElement(By.xpath("(//input[@name='firstname'])"));
	    firstname.sendKeys(name);
	    
	    String lastName=ExcelSheetPractice.getExcelSheetData("TestData", 0, 1);
	    WebElement lastname = driver.findElement(By.xpath("(//input[@name='lastname'])"));
	    lastname.sendKeys(lastName);
	    
	    String birthDate=ExcelSheetPractice.getExcelSheetData("TestData", 0, 2);
	    WebElement date = driver.findElement(By.xpath("(//select[@id='day'])"));
	    Select opt = new Select(date);
	    opt.selectByValue(birthDate);
	    
	    String birthMonth=ExcelSheetPractice.getExcelSheetData("TestData", 0, 3);
	    WebElement month = driver.findElement(By.xpath("(//select[@id='month'])"));
	    Select opt1 = new Select(month);
	    opt1.selectByVisibleText(birthMonth);
	    
	    String birthYear=ExcelSheetPractice.getExcelSheetData("TestData", 0, 4);
	    WebElement year = driver.findElement(By.xpath("(//select[@id='year'])"));
	    Select opt2 = new Select(year);
	    opt2.selectByValue(birthYear);

	    WebElement female = driver.findElement(By.xpath("(//span[contains(@class,'5dba')][1])"));
	    female.click();
	    System.out.println(female.isSelected());
	    
	   // WebElement male = driver.findElement(By.xpath("(//span[contains(@class,'5dba')][2])"));
	    //male.click();
	   // System.out.println(male.isSelected());
	    
	    String phone=ExcelSheetPractice.getExcelSheetData("TestData", 0, 5);
	    WebElement mobileNoOremail = driver.findElement(By.xpath("(//input[contains(@name,'email')][1])"));
	    mobileNoOremail.sendKeys(phone);
	    
	    String pass=ExcelSheetPractice.getExcelSheetData("TestData", 0, 6);
	    WebElement password = driver.findElement(By.xpath("(//input[contains(@name,'passwd')][1])"));
	    password.sendKeys(pass);
	    
	    WebElement signup = driver.findElement(By.xpath("(//button[@name='websubmit'])"));
	    signup.click();
	    
	    //WebElement alreadyHaveAnAccount = driver.findElement(By.xpath("(//a[text()='Already have an account?'])"));
	    //alreadyHaveAnAccount.click();
	    }
 
}
