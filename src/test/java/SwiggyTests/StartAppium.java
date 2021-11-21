package SwiggyTests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;

public class StartAppium {

	static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void beforeMethod () {

		try {

			setUp();

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	private static void setUp() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");

		cap.setCapability("platformVersion", "10.0.1");

		cap.setCapability("deviceName", "OnePlus");

		cap.setCapability("appPackage", "in.swiggy.android");

		cap.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");

		cap.setCapability("udid", "e277e0e7");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Application Started");
	}

}
