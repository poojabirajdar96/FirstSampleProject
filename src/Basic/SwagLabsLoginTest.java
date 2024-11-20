package Basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = AutomationPractice.launchBrowser("https://www.saucedemo.com/");
	}
	
	@Test
	public void validateLoginWithValidCredentials() throws InterruptedException {
		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
		swagLabsLoginPage.enterUsername("visual_user");
        swagLabsLoginPage.enterPassword("secret_sauce");
        Thread.sleep(2000);
        swagLabsLoginPage.clickOnLogin();
	}
	
	@Test
	public void validateLoginWithInvalidEmail() throws InterruptedException{
		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
		swagLabsLoginPage.enterUsername("Arise");
        swagLabsLoginPage.enterPassword("secret_sauce");
        Thread.sleep(2000);
        swagLabsLoginPage.clickOnLogin();
	}
	
	@Test
	public void validateLoginWithInvalidPassword() throws InterruptedException {
		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
		swagLabsLoginPage.enterUsername("visual_user");
		swagLabsLoginPage.enterPassword("sauce");
        Thread.sleep(2000);
        swagLabsLoginPage.clickOnLogin();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		}
	//public static void main(String args[]) throws InterruptedException {
		//SwagLabsLoginTest slabstest = new SwagLabsLoginTest();
	   // slabstest.validateLoginWithValidCredentials();
	    //slabstest.validateLoginWithInvalidEmail();
	    //slabstest.validateLoginWithInvalidPassword();
	//}

}
