package testcases.signin;

import testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginWithPage;
import thirdpartypage.SignInWithFacebookPage;
import utils.Log;

import java.io.IOException;

public class SIGNIN_TC003 extends BaseTest {

	HomePage homePage = new HomePage();
	LoginWithPage loginWithPage = new LoginWithPage();
	SignInWithFacebookPage signInWithFacebookPage = new SignInWithFacebookPage();

	@Test(description="Verify that user can sign in successfully via Facebook")
	public void TC003() {

		Log.info("Step #1: Click Login/Signup button");
		homePage.clickLogInSignUpButton();

		Log.info("Step #2: Click Signin with Facebook button");
		loginWithPage.clickSigninWithButton("Signin with Facebook");

		Log.info("Step #3: Signin with Google button");
		signInWithFacebookPage.signInWithFacebook("ac1994qt015@gmail.com", "speedcube2015");

		Log.info("Step #4: Verify Login/Signup button disappear");
		Assert.assertFalse(homePage.isLogInSignUpButtonDisplayed());
	}
}
