package pageObjectRrepository;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	

}
