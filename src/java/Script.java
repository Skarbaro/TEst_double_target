// package 

import homework2.AdminPageObjects;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Script {
	
	private int ab2, ab4;

    public static void main(String[] args) throws InterruptedException {

        AdminPageDrivers adminPageDriver = new AdminPageDrivers();
        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("chrome");
        AdminPageObjects adminPage = new AdminPageObjects(driver);


        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

        System.out.println("Log in to the Admin Panel");
        adminPageDriver.loginToAdminPanel(driver);

        System.out.println("Click on Categories");
        adminPageDriver.hoverMouseOnMenuItem(driver);
        adminPage.categoriesSubMenuItem().click();

        System.out.println("Click Add New Category button");
        adminPage.addNewCategoryButton().click();

        System.out.println("Add new category and save it");
        adminPage.categoryNameField().sendKeys(adminPageDriver.categoryName());
        adminPage.saveNewCategoryButton().click();

        System.out.println("Check success message");
        assertTrue(adminPage.successMessage().isDisplayed());

        logger.log("Filter categories by name");
        adminPage.searcByNameField().sendKeys(adminPageDriver.categoryName());
        adminPage.searcByNameButton().click();

        logger.log("Check filter results");
        assertTrue(adminPage.searcByNameElement().isDisplayed());

        logger.log("Close the browser");
        driver.quit();
    }
}
