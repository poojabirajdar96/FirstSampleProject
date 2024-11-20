package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsInventoryPage {
	@FindBy (xpath= "//img[@data-test='inventory-item-sauce-labs-backpack-img']") private WebElement productImg1;
	@FindBy (xpath= "//div[text()='Sauce Labs Backpack']") private WebElement productLabel1;
	@FindBy (xpath= "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement productAddToCartBtn1;
	
	public SwagLabsInventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProductImg1() {
		productImg1.click();
	}
	
	public void clickOnProductLabel1() {
		productLabel1.click();
	}
	
	public void clickOnProductAddToCartBtn1() {
		productAddToCartBtn1.click();
	}
}
