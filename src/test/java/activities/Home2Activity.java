package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Home2Activity extends BaseActivity{
	 @AndroidFindBy(id = "android:id/button1")
	 private AndroidElement buttonAllow;
	 
	 @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	 private AndroidElement buttonAllowlocation;

	
	public Home2Activity(AppiumDriver driver) {
	    super(driver);
 }
	public HomeActivity autorizar() {
		 buttonAllow.click();
		 buttonAllowlocation.click();
			
		 return new HomeActivity(driver);
	}
	
}
