package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRrepository.LoginPageObject;
import utilities.WebDriverUtility;

public class LoginTestStepDef extends Base {
// create object of Login Page Object in order to access its methods

	LoginPageObject login = new LoginPageObject();
	

// every Step in Scenario needs to have
// a method associated with in StepDefinitons class

	@Given("^User is on Retail Website$")
	public void User_is_on_Retail_Website() {
		openBrowser();
		logger.info("Retail Website is opened");

		WebDriverUtility.screenShot();
	}

	@When("^User click on MyAccount$")
	public void User_click_on_MyAccount() {
		login.clickOnMyAccount();
		logger.info("User clicked on MyAccount");

	}

	@And("^User click on Login$")
	public void User_click_on_Login() {
		login.clickOnLogin();
		logger.info("User Clicked on Login");
	}

// in cucumber stepDefinitions we need to pass value as a parameter
//we need to replace values with (.+)
// we need to pass parameters in our java methods as well
	@And("^User enter userName '(.+)' and password '(.+)'$")
	public void User_enter_userName_and_Password(String userName, String password) {
		login.enterEmail(userName);
		logger.info("user entered email");
		login.enterPassword(password);
		logger.info("user entered password");
		WebDriverUtility.screenShot();
	}

	@And("^User click on Login button$")
	public void User_click_on_Login_button() {
		login.clickOnLoginButton();
		logger.info("user clicked on login button");
	}

	@Then("^User should be logged in to MyAccount Dashboard$")
	public void User_should_be_logged_in_to_myAccount_Dashboard() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
	}

	@When("^User click on Register option$")
	public void user_click_on_Register_option() {
		login.clickOnRegisterOption();
		logger.info("user clicked on Register option");
	}

	@When("^User fill the Registration form with bellow information$")
	public void user_fill_the_Registration_form_with_bellow_information(DataTable info) {
		// cucumber datatable has a return of list<Map<String,String>> this is when
		// cucumber datatable has header.when
// cucumber datatable does not has header we will use List>List<index>
		List<Map<String, String>> dataValue = info.asMaps(String.class, String.class);
		login.enterFirstName(dataValue.get(0).get("firstName"));
		login.enterLastName(dataValue.get(0).get("lastName"));
		login.enterRegisterationEmail(dataValue.get(0).get("eMail"));
		login.entertelephone(dataValue.get(0).get("telephone"));
		login.enterRegisterationPassword(dataValue.get(0).get("password"));
		login.enterConfirmPassword(dataValue.get(0).get("passwordConfirm"));
		login.subscribe(dataValue.get(0).get("Subscribe"));
	}

	@When("^User accept the privacy any policy$")
	public void user_accept_the_privacy_any_policy() {
		login.clickOnprivacyPolicy();
		logger.info("user accepted the privacy any policy");
		WebDriverUtility.screenShot();
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() {
		login.clickOnContinueButton();
		logger.info("user clicked on continue button");

	}

	@Then("^User should be registered in Retail website$")
	public void user_should_be_registered_in_Retail_website() {
		String expectedMessage = "your Account Has Been Created!";
		String actualMessage = login.accountCreationMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("user Account Has Been Created");
		WebDriverUtility.screenShot();
	}
	
	



}
