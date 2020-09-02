package testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driver.DriverType;
import driver.DriverUtils;
import driver.manager.DriverManager;
import driver.manager.DriverManagerFactory;
import utils.Common;
import utils.Constants;
import utils.Log;
import utils.helpers.JsonHelper;
import utils.helpers.PropertiesHelper;

public class BaseTest {

	DriverManager driverManager;
	WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(@Optional String browser) {
		DriverType current = (browser != null && !"".equals(browser)) ? DriverType.fromName(browser) : DriverType.CHROME;
		driverManager = DriverManagerFactory.getDriverManager(current);
		driver = driverManager.getWebDriver();
		openBrowser();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite
	public void generateReport() {
		if (PropertiesHelper.getPropValue("report.generate").equals("true")) {
			Common.executeCmd(Constants.GENERATE_ALLURE_REPORT);
			Log.info("Generate allure report");
		}
	}

	public void openBrowser() {
		DriverUtils.maximumBrowser();
		driver.get(Constants.URL);
	}
}
