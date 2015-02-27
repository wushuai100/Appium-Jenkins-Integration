package com.mycompany.myapp.SrikanthMaven;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {
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
				"com.mobeta.android.demodslv");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.mobeta.android.demodslv.Launcher");
		cap.setCapability(MobileCapabilityType.APP,
				"C:\\selenium_tests\\lib\\Mobile_Testing\\com.mobeta.android.demodslv-3.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}
	@Ignore
	@Test
	public void dragDropTest() throws MalformedURLException,
			InterruptedException {

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElements(
				By.id("com.mobeta.android.demodslv:id/activity_title")).get(0)
				.click();
		driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"))
				.get(0);
		new TouchAction((MobileDriver) driver).press(69, 193).perform()
				.moveTo(50, 862).release().perform();
		for (int i = 0; i < driver.findElements(
				By.id("com.mobeta.android.demodslv:id/text")).size(); i++) {
			System.out.println(driver
					.findElements(By.id("com.mobeta.android.demodslv:id/text"))
					.get(i).getText());
		}
		assertEquals(
				"Brad Mehldau",
				driver.findElements(
						By.id("com.mobeta.android.demodslv:id/text")).get(7)
						.getText());
		driver.findElements(By.id("com.mobeta.android.demodslv:id/text"));
		// Thread.sleep(10000);
	
	}

	@Test
	public void dragDropTest1() throws MalformedURLException,
			InterruptedException {
		TouchAction element;
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElements(
				By.id("com.mobeta.android.demodslv:id/activity_title")).get(0)
				.click();
		driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"))
				.get(0);
		element = new TouchAction((MobileDriver) driver).press(69, 193)
				.perform().moveTo(50, 862).release().perform();

		// Thread.sleep(10000);

	}

	@After
	public void tearDown() throws InterruptedException {

		// Thread.sleep(10000);
		driver.quit();
	}

}
