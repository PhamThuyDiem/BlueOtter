package pages;

import controls.common.Button;
import controls.common.Link;
import controls.common.TextBox;

public class LoginPage {

	private TextBox txtUsername = new TextBox("name=email");
	private TextBox txtPassword = new TextBox("name=password");
	private Button btnLogin = new Button("//button[text()='Login']");
	private Button btnLoading = new Button("//button[text()='Loading']");
	private Link btnLogInSignUp= new Link("//span//a[normalize-space()='Sign up here']");

	public void clickSignUpLink() {
		btnLogInSignUp.waitForVisibility();
		btnLogInSignUp.click();
	}

	public void fillWithEmail(String email, String password) {
		txtUsername.waitForVisibility();
		txtUsername.enter(email);
		txtPassword.enter(password);
	}

	public void waitForAuthenticating() {
		if(btnLoading.isExist()) {
			btnLoading.waitForInVisibility();
		}
	}

	public void clickLoginButton() {
		btnLogin.waitForVisibility();
		btnLogin.click();
		waitForAuthenticating();
	}

	public void loginWithEmail(String email, String password) {
		fillWithEmail(email, password);
		clickLoginButton();
	}
}