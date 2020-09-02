package pages;

import controls.common.Button;

public class LoginWithPage {

	private Button btnSigninWithEmail = new Button("//a[div[text()='Signin with Email']]");
	private Button btnSigninWith = new Button("//button[div[text()='%s']]");
	
	public void clickSigninWithEmailButton() {
		btnSigninWithEmail.waitForVisibility();
		btnSigninWithEmail.click();
	}

	public void clickSigninWithButton(String typeButton) {
		btnSigninWith.setDynamicValue(typeButton);
		btnSigninWith.waitForVisibility();
		btnSigninWith.click();
	}
}