package testcases.signup;

import io.qameta.allure.Step;
import testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Common;
import utils.Log;

public class SIGNUP_TC001 extends BaseTest {

	HomePage homePage = new HomePage();
	LoginWithPage loginWithPage = new LoginWithPage();
	LoginPage loginPage = new LoginPage();
	RegisterPage registerPage = new RegisterPage();
	Common common = new Common();

	@Test(description="Verify that user can sign up successfully via email")
	public void TC001() {

		Log.info("Step #1: Click Login/Signup button");
		homePage.clickLogInSignUpButton();

		Log.info("Step #2: Click Signin with Email button");
		loginWithPage.clickSigninWithEmailButton();

		Log.info("Step #3: Click Sign up here link");
		loginPage.clickSignUpLink();

		Log.info("Step #4: Click Sign up here link");
		registerPage.submitRegister("diempham", common.randomEmail(), "123456", "123456", "");

		Log.info("Step #5: Verify Login/Signup button disappear");
		Assert.assertFalse(homePage.isLogInSignUpButtonDisplayed());
	}
}
