package com.cogniphi.BusAttendor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.python.modules.thread.thread;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

	static AndroidDriver<WebElement> driver;
	//static WebDriver driver;
	static DesiredCapabilities dc;

	public static void Login() throws MalformedURLException, InterruptedException {
		dc = new DesiredCapabilities();

		/*dc.setCapability("appPackage", "com.flipkart.android");
		dc.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");*/
		
		/*dc.setCapability("appPackage", "com.kawika.itac");
		dc.setCapability("appActivity", "com.kawika.itac.MainActivity");*/
		
		dc.setCapability("appPackage", "com.facebook.katana");
		dc.setCapability("appActivity", "com.facebook.katana.dbl.activity.FacebookLoginActivity");

		dc.setCapability("deviceName", "Lenevo k33a42");
		dc.setCapability("plotformVersion", "7.0");
		dc.setCapability("plotformName", "Android");
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.className("android.widget.EditText")).sendKeys("8547382811");
		driver.findElement(By.className("android.widget.Button")).click();

	}

	public static void Logout() {
		//driver.findElementByAndroidUIAutomator("text(\"menu1\")").click();
		
		//driver.findElementByAndroidUIAutomator("text(\"Logout\")").click();
	}

	public static void invalid_Login() {
		driver.findElement(By.className("android.widget.EditText")).sendKeys("9705007622");
		driver.findElement(By.className("android.widget.Button")).click();
		String text = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text);
		driver.findElement(By.id("android:id/button1")).click();
	}

	public static void validate_Mob_Text_Field() {
		driver.findElement(By.className("android.widget.EditText")).sendKeys("other0123456789");
		driver.findElement(By.className("android.widget.Button")).click();
		String text = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text);
		driver.findElement(By.id("android:id/button1")).click();
	}

	public static void verify_checkBox() throws Exception {
		driver.findElement(By.className("android.widget.EditText")).clear();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("8547382811");
		driver.findElement(By.className("android.widget.Button")).click();
		//driver.findElementByAndroidUIAutomator("text(\"Silvermount School\")").click();
		driver.findElement(By.id("present")).click();

		String text = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text);
		//driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		String text1 = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text1);
		//driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//driver.findElementByAndroidUIAutomator("text(\"Silvermount School\")").click();
		
		/*driver.findElementByAndroidUIAutomator("text(\"Pooppalam\")").click();
		driver.findElement(By.id("present")).click();

		String text2 = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text2);
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		String text3 = driver.findElement(By.id("android:id/message")).getText();
		System.out.println(text3);
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		driver.findElement(By.xpath("//*[@id='present'].instance(3)")).click();

		driver.findElementByAndroidUIAutomator("text(\"Nenminippurath Ayyappan Temple\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Kattukulam Masjid\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Starting Point\")").click();*/

	}

}
