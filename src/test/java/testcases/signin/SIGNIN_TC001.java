package testcases.signin;

import testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginWithPage;
import utils.Log;

import java.io.IOException;

public class SIGNIN_TC001 extends BaseTest {

	HomePage homePage = new HomePage();
	LoginWithPage loginWithPage = new LoginWithPage();
	LoginPage loginPage = new LoginPage();

	@Test(description="Verify that user can sign in successfully via email")
	public void TC001() {

		Log.info("Step #1: Click Login/Signup button");
		homePage.clickLogInSignUpButton();

		Log.info("Step #2: Click Signin with Email button");
		loginWithPage.clickSigninWithEmailButton();

		Log.info("Step #3: Login with valid email and password");
		loginPage.loginWithEmail("diempham99999@mailinator.com", "123456");

		Log.info("Step #4: Verify Login/Signup button disappear");
		Assert.assertFalse(homePage.isLogInSignUpButtonDisplayed());
	}
}
