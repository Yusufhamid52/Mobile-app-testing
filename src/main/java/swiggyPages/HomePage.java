package swiggyPages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class HomePage {
	
	@FindBy(id="in.swiggy.android:id/item_menu_top_header_restaurant_name3")
	private MobileElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}
	
}
