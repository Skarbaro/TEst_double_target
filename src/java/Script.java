package src.java;

import homework2.AdminPageObjects;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Script {

    public static void main(String[] args) throws InterruptedException {

        AdminPageDrivers adminPageDriver = new AdminPageDrivers();
        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("chrome");
        AdminPageObjects adminPage = new AdminPageObjects(driver);

        System.out.println("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

        logger.log("Click on Categories");
        adminPageDriver.hoverMouseOnMenuItem(driver);
        adminPage.categoriesSubMenuItem().click();

        System.out.println("Click Add New Category button");
        adminPage.addNewCategoryButton().click();

        
        System.out.println("Check filter results");
        assertTrue(adminPage.searcByNameElement().isDisplayed());

    }
}
