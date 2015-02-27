package com.mycompany.myapp.SrikanthMaven;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SwipeActionTest {
	AndroidDriver driver;
	DesiredCapabilities cap;

	@Before
	public void startUp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3.3");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE,
				"com.android.calendar");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.android.calendar.AllInOneActivity");
		//cap.setCapability(MobileCapabilityType.APP,
			//	"C:\\selenium_tests\\lib\\Mobile_Testing\\com.leocardz.multitouch.test-19.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@Ignore
	@Test
	public void dragDropTest() throws MalformedURLException,
			InterruptedException {
		//driver.swipe(84, 561, 726, 565, 1000);
	TouchAction action=new TouchAction(driver);
		action.longPress(182, 418).release().perform();
	}

}
