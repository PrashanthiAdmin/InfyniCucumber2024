package infyni.cucumber2024may.pageobjects;

import org.openqa.selenium.By;

import infyni.cucumber2024may.base.Base;


public class LoginPage extends Base {

	public static By emailInputBox = By.id("user_email");
	public static By passwordInputBox = By.id("user_password");
	public static By signInButton = By.name("commit");
	public static By allProjectsText = (By.id("ember57"));
	public static By invalidErrorText = By.tagName("h2");

	public static void enterEmailId(String email) {

		try {
			
			driver.findElement(emailInputBox).clear();
			driver.findElement(emailInputBox).sendKeys(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void enterPassword(String pwd) {

		try {
			driver.findElement(passwordInputBox).clear();
			driver.findElement(passwordInputBox).sendKeys(pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void clickSignInButton() {
		try {
			driver.findElement(signInButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String captureAllProjectsText() {

		String actualText = driver.findElement(allProjectsText).getText();
		return actualText;

	}

	public static String captureErrorText() {

		String actualText = driver.findElement(invalidErrorText).getText();
		return actualText;

	}

}
