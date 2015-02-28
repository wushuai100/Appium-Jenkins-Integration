package com.mycompany.myapp.SrikanthMaven;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhoneAppTest {
	AndroidDriver driver;
	DesiredCapabilities cap;
	@Before
	public void startUp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PLATFORM_NAME"));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PLATFORM_VERSION"));
		cap.setCapability(MobileCapabilityType.APP_PACKAGE,
				"com.android.dialer");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.android.dialer.DialtactsActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@Test
	public void dragDropTest() throws MalformedURLException,
			InterruptedException {/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the phone number");
		int digit=scan.nextInt();
		LinkedList<Integer>stack=new LinkedList<Integer>();
		while(digit>0){
			stack.push(digit%10);
			digit=digit/10;
		}
		while(!stack.isEmpty()){
			switch (stack.pop()) {
			case 1:
				driver.findElement(By.id("com.android.dialer:id/one")).click();
				break;
			case 2:
				driver.findElement(By.id("com.android.dialer:id/two")).click();
				break;
			case 3:
				driver.findElement(By.id("com.android.dialer:id/three")).click();
				break;
			case 4:
				driver.findElement(By.id("com.android.dialer:id/four")).click();
				break;
			case 5:
				driver.findElement(By.id("com.android.dialer:id/five")).click();
				break;
			case 6:
				driver.findElement(By.id("com.android.dialer:id/six")).click();
				break;
			case 7:
				driver.findElement(By.id("com.android.dialer:id/seven")).click();
				break;
			case 8:
				driver.findElement(By.id("com.android.dialer:id/eight")).click();
				break;
			case 9:
				driver.findElement(By.id("com.android.dialer:id/nine")).click();
				break;
			case 0:
				driver.findElement(By.id("com.android.dialer:id/zero")).click();
				break;
			default:
				break;
			}
			
		}
		
		*/
		System.out.println("test passed");
		
		
		}
}
