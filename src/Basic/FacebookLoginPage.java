package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	@FindBy (xpath = "//input[@id='email']") private WebElement email;
	@FindBy (xpath = "//input[@id='pass']") private WebElement password;
	@FindBy (xpath = "//button[@name='login']") private WebElement loginBtn;
	@FindBy (xpath = "//a[text() = 'Forgotten password?']") private WebElement forgotPasswordBtn;
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement createNewAccountBtn;
	@FindBy (xpath = "//a[@class='_8esh']") private WebElement createNewPageBtn;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPasswordBtn.click();
	}
	
	public void clickOnCreateNewAccount() {
		createNewAccountBtn.click();
	}
	
	public void clickOnCreateNewPage() {
		createNewPageBtn.click();
	}
}
