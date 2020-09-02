package driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.manager.DriverManagerFactory;
import utils.Constants;

import java.sql.DriverManager;

public class DriverUtils extends DriverManagerFactory {
	
	public static void waitForAlert(int timeOutInSeconds) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
    	wait.until(ExpectedConditions.alertIsPresent());
    }
	public static void maximumBrowser() {
		getDriver().manage().window().maximize();
	}
	
	public static Object execJavaScript(String script, Object... objs) {
        return ((JavascriptExecutor) getDriver()).executeScript(script, objs);
    }
	
	public static int getTimeOut() {
        return DriverManagerFactory.getTimeOut();
    }
	
	public static Alert switchToAlert() {
		return getDriver().switchTo().alert();
		
	}
	
	public static String getTextAlert() {
		waitForAlert(Constants.VERY_SHORT_TIME);
		return switchToAlert().getText();
	}
	
	public static String getTitle() {
		return getDriver().getTitle();
	}
	
	public static void acceptAltert() {
		waitForAlert(Constants.VERY_SHORT_TIME);
		switchToAlert().accept();
	}

	public static WebDriver getWebDriver() {
		return getDriver();
	}
}
