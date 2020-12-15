package homework2;

import homework3.AdminPageDrivers;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;


public class ScriptA {
	
	private test2;
	
	private static final String p = "123456"; // hard-coded credential
 
	public static void main(String args[]) throws SQLException {
		String url = "jdbc:mysql://localhost/test";
		String u = "admin"; // hard-coded credential
	 
		getConn(url, u, p);
	}
 
	public static void getConn(String url, String v, String q) throws SQLException {
		DriverManager.getConnection(url, v, q); // sensitive call
	}

    public static void main(String[] args) {

        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("ie");
        AdminPageObjects adminPage = new AdminPageObjects(driver);
        AdminPageDrivers loginToAdmin = new AdminPageDrivers();

        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        logger.log("Log in to the Admin Panel");
        loginToAdmin.loginToAdminPanel(driver);

        logger.log("Click employee name dropdown toggle");
        adminPage.employeeNameDropdownToggle().click();

        logger.log("Click logout link");
        adminPage.logoutLink().click();

        logger.log("Close the browser");
        driver.quit();
    }
	
<<<<<<< HEAD:src/java/br7/ScriptA.java
	public static void main (String args[]) {
		
		double a = 3;
		int b = 4;
		int c. ter = 3;
		c = Math.sqrt (a* a + b* b);
		System.out.println("c = "+ c);
=======
	public static void main (String[] args) {
		
		private test1;
		
		double a = 3, b = 4, c. ter = 3;
		c = Math.sqrt (a* a + b* b);
		System.out.println ("c = "+ c);
>>>>>>> br5:src/java/ScriptA.java
	}
}
