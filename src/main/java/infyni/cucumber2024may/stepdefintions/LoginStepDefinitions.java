package infyni.cucumber2024may.stepdefintions;

import org.testng.Assert;

import infyni.cucumber2024may.pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends LoginPage {

	@Before
	public void browser_should_show_login_page_of_the_application() {

		try {
			launchApplication("Chrome");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitWait(3);

	}

	@When("user enters email id {string}")
	public void user_enters_email_id(String arg1) {
		enterEmailId(arg1);
	}

	@When("user enters password {string}")
	public void user_enters_password(String arg1) {
		enterPassword(arg1);
	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button() {

		clickSignInButton();
	}

	@Then("user should be able to successfully login to the application")
	public void user_should_be_able_to_successfully_login_to_the_application() {

		String actualText = captureAllProjectsText();

		String expectedText = "All projects";

		Assert.assertEquals(actualText, expectedText);

	}

	@Then("user should logout from the application successfully")
	public void user_should_logout_from_the_application_successfully() {

	}

	@Then("user should see the error message on the screen")
	public void user_should_see_the_error_message_on_the_screen() {

		String actualText = captureErrorText();

		String expectedText = "An error has occurred";

		Assert.assertEquals(actualText, expectedText);
	}
	
	

	@After
	public void user_closes_the_browser() {
		
		closeBrowser();
		
	}
	}



