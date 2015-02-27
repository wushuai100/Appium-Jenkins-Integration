package com.mycompany.myapp.SrikanthMaven;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookTest {
	WebDriverWait wait;
	@Ignore
	@Test
	public void faceBookLogin() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE,
				"com.facebook.katana");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.facebook.katana.LoginActivity");
		cap.setCapability(
				MobileCapabilityType.APP,
				"C:\\selenium_tests\\lib\\Mobile_Testing\\com.facebook.katana.apk");
		//cap.setCapability("noReset", true);

		AndroidDriver driver = new AndroidDriver(new URL(
				"http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")")
				.clear();
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")")
				.sendKeys("homaassal@gmail.com");

		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").sendKeys("assali16");
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().resourceId(\"com.facebook.katana:id/login_login\")")
				.click();
				
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().resourceId(\"com.facebook.katana:id/publisher_button0\").text(\"Status\")")
				.click();
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().resourceId(\"com.facebook.katana:id/status_text\").text(\"What's on your mind?\")")
				.sendKeys("Hello From Appium");
		
		driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Post\").resourceId(\"com.facebook.katana:id/composer_primary_named_button\")").click();
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.facebook.katana:id/header_view_menu_button")));
		driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Story Menu\").resourceId(\"com.facebook.katana:id/header_view_menu_button\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/fbui_popover_list_item_title\").text(\"Delete\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Delete\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/bookmarks_tab\")").click();
		driver.scrollToExact("About");
		Thread.sleep(3000);
		driver.scrollToExact("Log Out").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Log Out\")").click();
	
		//MobileElement element = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"About\")");
		//element.click();
		
		
		
		
		
		
		
		
		
		
		

	}
}
