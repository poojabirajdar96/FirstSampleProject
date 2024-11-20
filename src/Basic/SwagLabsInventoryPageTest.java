package Basic;

import org.openqa.selenium.WebDriver;

public class SwagLabsInventoryPageTest {
   public void validateProductImgClick() {
	   WebDriver driver = AutomationPractice.launchBrowser("https://www.saucedemo.com/inventory.html");
	   SwagLabsInventoryPage swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
	   swagLabsInventoryPage.clickOnProductImg1();
   }
   
   public void validateProductLabelClick() {
	   WebDriver driver = AutomationPractice.launchBrowser("https://www.saucedemo.com/inventory.html");
	   SwagLabsInventoryPage swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
	   swagLabsInventoryPage.clickOnProductLabel1();
   }
   
   public void validateProductAddToCartClick() {
	   WebDriver driver = AutomationPractice.launchBrowser("https://www.saucedemo.com/inventory.html");
	   SwagLabsInventoryPage swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
	   swagLabsInventoryPage.clickOnProductAddToCartBtn1();
   }
   
   public static void main(String args[]) throws InterruptedException{
	   SwagLabsInventoryPageTest slabsInventory = new SwagLabsInventoryPageTest();
	   SwagLabsLoginTest slabstest = new SwagLabsLoginTest();
	   slabstest.validateLoginWithValidCredentials();
	   
	   slabsInventory.validateProductImgClick();
	   //slabstest.validateLoginWithValidCredentials();
	   slabsInventory.validateProductLabelClick();
	  // slabstest.validateLoginWithValidCredentials();
	   slabsInventory.validateProductAddToCartClick();
   }
}
