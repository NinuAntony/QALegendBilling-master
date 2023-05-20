package com.qalegend.testscripts;




import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.ProfilePage;
import com.qalegend.pages.SignOutPage;

public class ProfilePageTest extends BaseSetUp{
	LoginPage login;
	ProfilePage profile;
	 @Test(priority=1,description="TC006_Profile Name Click",groups= {"Regression"}) 
	 public void TC006_profileNameClick()
	 {
		 login=new LoginPage(driver);
		 login.loginCrendentials();
		 
	 profile=new ProfilePage(driver);
     profile.ProfileDropDown();
	 profile.profileButton();
	 profile.CurrentPasword();
	 profile.NewPasword();
	 profile.ConfirmPasword();
	 profile.update1();
	 
	 profile.prefix();
	 profile.firstName();
	 profile.lastName();
	 profile.eMail();
	 profile.languageContainerEnglish();
	 profile.languageContainerAlbanian();
	 profile.languageContainerFrench();
	 profile.languageContainerHindi();
	 profile.languageContainerSpanish();
	 }
}
	 
	 	
	 
	 
	 
