package thirdpartypage;

import controls.common.Button;
import controls.common.TextBox;
import driver.DriverUtils;

public class SignInWithFacebookPage {

	private TextBox txtEmailOrPhone = new TextBox("id=email");
	private TextBox txtPassword = new TextBox("id=pass");
	private Button btnLogin = new Button("id=loginbutton");
	private Button btnContinueAs = new Button("//button[contains(.,'Continue')]");

	public void signInWithFacebook(String email, String pass) {
		for (String handle : DriverUtils.getWebDriver().getWindowHandles()) {
			DriverUtils.getWebDriver().switchTo().window(handle);
		}
		txtEmailOrPhone.waitForVisibility();
		txtEmailOrPhone.enter(email);
		txtPassword.enter(pass);
		btnLogin.click();
		if (btnContinueAs.isExist()) {
			btnContinueAs.click();
		}
	}
}