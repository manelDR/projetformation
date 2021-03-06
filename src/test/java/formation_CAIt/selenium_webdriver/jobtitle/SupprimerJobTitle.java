package formation_CAIt.selenium_webdriver.jobtitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import formation_CAIt.selenium_webdriver.Connexion;

public class SupprimerJobTitle {
	private static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public static void setUp() throws Exception {
		driver = Connexion.getDriver();
	}

	@Test
	public void testSupprimerJt() throws Exception {
		driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/admin/viewJobTitleList");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("ohrmList_chkSelectRecord_2")).click();
		;
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();

		for (int i = 3; i <= 4; i++) {
			driver.findElement(By.id("ohrmList_chkSelectRecord_" + i)).click();
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();

	}
}
