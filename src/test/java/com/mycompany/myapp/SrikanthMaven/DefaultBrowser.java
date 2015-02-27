package com.mycompany.myapp.SrikanthMaven;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DefaultBrowser {
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
				"com.android.chrome");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.google.android.apps.chrome.Main");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}@Ignore
	@Test
	public void dragDropTest() throws MalformedURLException,
			InterruptedException {
		driver.get("http://kroger.com");
		System.out.println(driver.getPageSource());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return navigator.userAgent"));
			
		}

}
