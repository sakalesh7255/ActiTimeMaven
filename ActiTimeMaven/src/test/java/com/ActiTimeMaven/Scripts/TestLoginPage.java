package com.ActiTimeMaven.Scripts;

import org.testng.annotations.Test;

import com.frame.generics.BaseTest;
import com.frame.generics.FWUtils;
import com.frame.pages.EnterTimeTrackPage;
import com.frame.pages.LogInPage;

public class TestLoginPage extends BaseTest{
	
	@Test
	public void validloginpage() {
		
		String un = FWUtils.read_XL_Data(Read_XL_data, "Sheet1", 1, 0);
		String pw = FWUtils.read_XL_Data(Read_XL_data, "Sheet1", 1, 1);
		String ExpectedTitleETP = FWUtils.read_XL_Data(Read_XL_data, "Sheet1", 1, 2);
		
		LogInPage lp = new LogInPage(driver);
		lp.setusername(un);
		lp.setpassword(pw);
		lp.clickonlogin();
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		FWUtils.VerifyPageTitle(driver, ExpectedTitleETP);
		etp.clickOnLogOutLink();
	}

}
