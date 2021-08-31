package pageObjectRrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showalldesktops;

	@FindBy(id = "content")
	private WebElement Content;

	public void clickOnDesktopstab() {
		WebDriverUtility.clickOnElement(desktops);
	}

	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showalldesktops);
	}

	public void displayDesktops() {
		WebDriverUtility.isElementDisplayed(Content);

	}



	}


