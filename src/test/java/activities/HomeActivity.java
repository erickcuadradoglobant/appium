package activities;

import java.io.Console;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeActivity extends BaseActivity {
	 
	@AndroidFindBy(tagName = "New Tweet")
	 private AndroidElement composer_write;
	 
	@AndroidFindBy(tagName = "Home")
	 private AndroidElement homeLabel;
	
	@AndroidFindBy(tagName = "Home Tab")
	 private AndroidElement homeTab;
	
	@AndroidFindBy(id="com.twitter.android:id/drawer_icon")
	 private AndroidElement profileButton;


	
	@AndroidFindBy(id = "com.twitter.android:id/dms")
	private AndroidElement buzon;

	 public HomeActivity(AppiumDriver driver) {
		    super(driver);
	 }
	 
	 public TweetActivity twiitear(String message) {
		 System.out.println("Current activity:" + ((AndroidDriver)driver).currentActivity());
		 click(profileButton);
		 return new TweetActivity(driver);

	 }

}

