package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginSteps extends Base{
	
	LoginPageObjects login = new LoginPageObjects();
	
	@Given("^user is on test environment homepage$")
	public void user_is_on_test_environment_homepage() {
		login.validateHomePage();
	}
	
	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() {
		login.clickOnMyAccountButton();
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {
		login.enterUserName();
		login.enterPassword();
	}

	@Then("user click on login button to login to the page")
	public void user_click_on_login_button_to_login_to_the_page() {
		login.clickOnLoginButtonMain();
	}
}
