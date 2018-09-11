package com.cogniphi.BusAttendor.TestSuites;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.cogniphi.BusAttendor.Home_Page;

public class HomePage {
	
  @Test
  public void TC_001_veify_Login() throws MalformedURLException, InterruptedException {
	  Home_Page.Login();
  }
  @Test(enabled = false)
  public void TC_002_verify_Invalid_Login() {
	  Home_Page.Logout();
	  Home_Page.invalid_Login();
	  
  }
  @Test(enabled = false)
  public void TC_003_verify_Num_Field() {
	  Home_Page.validate_Mob_Text_Field();
  }
  @Test
  public void TC_004_verify_present_Checkbox() throws Exception {
	  Home_Page.Logout();
	  Home_Page.verify_checkBox();
  }
}
