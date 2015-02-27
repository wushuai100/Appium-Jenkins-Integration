package com.mycompany.myapp.SrikanthMaven;

import static org.junit.Assert.assertEquals;
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
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultiTouchTest {
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
				"com.leocardz.multitouch.test");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.leocardz.multitouch.test.MultitouchTest");
		cap.setCapability(MobileCapabilityType.APP,
				"C:\\selenium_tests\\lib\\Mobile_Testing\\com.leocardz.multitouch.test-19.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@Ignore
	@Test
	public void dragDropTest() throws MalformedURLException,
			InterruptedException {
		TouchAction action= new TouchAction((MobileDriver)driver);
		TouchAction action1= new TouchAction((MobileDriver)driver);
		action.longPress(216, 639);
		action.waitAction(5000);
		action1.longPress(576, 547);
		action1.waitAction(5000);
		MultiTouchAction multitouch=new MultiTouchAction((MobileDriver)driver);
		multitouch.add(action).add(action1).perform();
	
	}

}
