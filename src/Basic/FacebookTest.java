package Basic;

import org.openqa.selenium.WebDriver;

public class FacebookTest {
	
	public void validateLoginWithValidCredentials() throws InterruptedException {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.enterEmail("Arise@gmail.com");
        facebookLoginPage.enterPassword("12345");
        Thread.sleep(2000);
        facebookLoginPage.clickOnLogin();
	}
	
	public void validateLoginWithInvalidEmail() throws InterruptedException{
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.enterEmail("A@gmail.com");
        facebookLoginPage.enterPassword("12345");
        Thread.sleep(2000);
        facebookLoginPage.clickOnLogin();
	}
	
	public void validateLoginWithInvalidPassword() throws InterruptedException {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.enterEmail("Arise@gmail.com");
        facebookLoginPage.enterPassword("12");
        Thread.sleep(2000);
        facebookLoginPage.clickOnLogin();
	}
	
	public void validateLoginWithForgotPassword() {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickOnForgotPassword();
	}
	
	public void validateLoginWithCreateNewAccount() {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickOnCreateNewAccount();
	}
	
	public void validateLoginWithCreateNewPage() {
		WebDriver driver = AutomationPractice.launchBrowser("https://www.facebook.com/");
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickOnCreateNewPage();
	}
	
	public static void main(String args[]) throws InterruptedException {
		FacebookTest fbtest = new FacebookTest();
		fbtest.validateLoginWithValidCredentials();
		fbtest.validateLoginWithInvalidEmail();
		fbtest.validateLoginWithInvalidPassword();
		fbtest.validateLoginWithForgotPassword();
		fbtest.validateLoginWithCreateNewAccount();
		fbtest.validateLoginWithCreateNewPage();
	}
}
