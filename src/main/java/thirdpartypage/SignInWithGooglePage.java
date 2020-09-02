package thirdpartypage;

import controls.common.Button;
import controls.common.TextBox;
import driver.DriverUtils;

public class SignInWithGooglePage {

	private TextBox txtEmailOrPhone = new TextBox("//div[text()='Email or phone']//preceding-sibling::input");
	private Button btnNext = new Button("//button[span[text()='Next']]");
	private TextBox txtEnterYourPassword = new TextBox("//div[text()='Enter your password']//preceding-sibling::input");

	public void signInWithGoogle(String email, String pass) {
		for (String handle : DriverUtils.getWebDriver().getWindowHandles()) {
			DriverUtils.getWebDriver().switchTo().window(handle);
		}
		txtEmailOrPhone.waitForVisibility();
		txtEmailOrPhone.enter(email);
		btnNext.click();
		txtEnterYourPassword.enter(email);
		btnNext.click();
	}
}