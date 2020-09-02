package pages;

import controls.common.*;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private Button btnLogInSignUp = new Button("//button[normalize-space()='Login/Signup']");
	private Button btnUserMenu = new Button("//button[span[@class='MuiIconButton-label']//img]");
	private Button btnUserMenuOption = new Button("//button//following-sibling::div//a[text()='%s']");

	@Step("Step #1: Click Login/Signup button")
	public void clickLogInSignUpButton() {
		btnLogInSignUp.waitForVisibility();
		btnLogInSignUp.click();
	}

	public void selectUserMenu(String userMenu) {
		btnUserMenu.waitForVisibility();
		btnUserMenu.click();
		btnUserMenuOption.setDynamicValue(userMenu);
		btnUserMenuOption.waitForVisibility();
		btnUserMenuOption.click();
	}

	public boolean isLogInSignUpButtonDisplayed() {
		return btnLogInSignUp.isExist(3);
	}
}