package com.cogniphi.BusAttendor.TestSuites;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class NewTest {
	public AndroidDriver<WebElement> driver;
	//static WebDriver driver;
	 
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities dc = new DesiredCapabilities();

		/*dc.setCapability("appPackage", "com.flipkart.android");
		dc.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");*/
		
		dc.setCapability("appPackage", "com.kawika.itac");
		dc.setCapability("appActivity", "com.kawika.itac.MainActivity");
		
		/*dc.setCapability("appPackage", "com.google.android.apps.maps");
		dc.setCapability("appActivity", "com.google.android.apps.maps.MapsActivity");*/
	  

		dc.setCapability("deviceName", "Lenevo k33a42");
		dc.setCapability("plotformVersion", "7.0");
		dc.setCapability("plotformName", "Android");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.className("android.widget.EditText")).sendKeys("8547382811");
		driver.findElement(By.className("android.widget.Button")).click();
		

	  
  }
}
