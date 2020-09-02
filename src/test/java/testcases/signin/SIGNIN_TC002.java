package testcases.signin;

import testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginWithPage;
import thirdpartypage.SignInWithGooglePage;
import utils.Log;

import java.io.IOException;

public class SIGNIN_TC002 extends BaseTest {

	HomePage homePage = new HomePage();
	LoginWithPage loginWithPage = new LoginWithPage();
	SignInWithGooglePage signInWithGooglePage = new SignInWithGooglePage();

	@Test(description="Verify that user can sign in successfully via Google")
	public void TC002() {

		Log.info("Step #1: Click Login/Signup button");
		homePage.clickLogInSignUpButton();

		Log.info("Step #2: Click Signin with Google button");
		loginWithPage.clickSigninWithButton("Signin with Google");

		Log.info("Step #3: Signin with Google button");
		signInWithGooglePage.signInWithGoogle("amimi0996@gmail.com", "Tcdtcb1996");

		Log.info("Step #4: Verify Login/Signup button disappear");
		Assert.assertFalse(homePage.isLogInSignUpButtonDisplayed());
	}
}
