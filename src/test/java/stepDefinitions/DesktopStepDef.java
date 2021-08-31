package stepDefinitions;

import core.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRrepository.DesktopPageObject;

public class DesktopStepDef extends Base {
	DesktopPageObject assign = new DesktopPageObject();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		assign.clickOnDesktopstab();
		logger.info("user_click_on_Desktops_tab");
	}

	@When("^User click on show all desktops$")
	public void user_click_on_show_all_desktops() {
		assign.clickOnShowAllDesktops();
		logger.info("User_click_on_show_all_desktops");

	}

	@Then("^User should see all items are present in Deskop page$")
	public void user_should_see_all_items_are_present_in_Deskop_page() {
	assign.displayDesktops();
	logger.info("User_should_see_all_items_are_present_in_Deskop_page");

	}
}
