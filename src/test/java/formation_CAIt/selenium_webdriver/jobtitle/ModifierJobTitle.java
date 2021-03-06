package formation_CAIt.selenium_webdriver.jobtitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import formation_CAIt.selenium_webdriver.Connexion;

public class ModifierJobTitle {
	private static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = Connexion.getDriver();
	}

	@Test
	public static void testModifierTitle() throws Exception {
		driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/dashboard");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.linkText("consultanttest1")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).clear();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("consultanttest1 modif");
		driver.findElement(By.id("btnSave")).click();

	}
}
