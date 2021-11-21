package SwiggyTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import swiggyPages.HomePage;

public class LoginTest extends StartAppium {

	private HomePage homePage;

	@BeforeMethod
	private void beforeSetup() {
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void loginCorrectValues() {
		homePage.clickLogin();
	}
}
