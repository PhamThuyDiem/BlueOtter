package pages;

import controls.common.Button;
import controls.common.Link;
import controls.common.TextBox;

public class RegisterPage {

	private TextBox txtUsername = new TextBox("name=username");
	private TextBox txtEmail = new TextBox("name=email");
	private TextBox txtPassword = new TextBox("name=password");
	private TextBox txtConfirmPassword = new TextBox("name=confirmPassword");
	private TextBox txtPhoneNumber = new TextBox("name=phone");
	private Button btnJoin = new Button("//button[text()='Join']");
	private Button btnLoading = new Button("//button[text()='Loading']");

	public void fillRegisterForm(String userName, String email, String password, String confirmPassword, String phone) {
		txtUsername.waitForVisibility();
		txtUsername.clear();
		txtUsername.enter(userName);
		txtEmail.clear();
		txtEmail.enter(email);
		txtPassword.clear();
		txtPassword.enter(password);
		txtConfirmPassword.clear();
		txtConfirmPassword.enter(confirmPassword);
		txtPhoneNumber.clear();
		txtPhoneNumber.enter(phone);
	}

	public void waitForAuthenticating() {
		if(btnLoading.isExist()) {
			btnLoading.waitForInVisibility();
		}
	}

	public void submitRegister(String userName, String email, String password, String confirmPassword, String phone) {
		fillRegisterForm(userName, email, password, confirmPassword, phone);
		btnJoin.click();
		waitForAuthenticating();
	}
}