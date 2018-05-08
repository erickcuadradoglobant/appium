package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BaseActivity {
	protected AppiumDriver driver;
	private WebDriverWait wait;

	public BaseActivity(AppiumDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 5);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	protected void click(AndroidElement element) {
		Reporter.log("Clicking -> " + ("".equals(element.getText()) ? element.getId() : element.getText()));
		getWait().until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	protected void sendKeys(AndroidElement element, String keys) {
		Reporter.log("Sending keys to -> " + ("".equals(element.getText()) ? element.getId() : element.getText())
				+ " : " + keys);
		getWait().until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(keys);
	}

	public void swipe(int startX, int startY, int endX, int endY) {
		Reporter.log("Swiping: [" + startX + ", " + startY + "] [" + endX + ", " + endY + "]");
		TouchAction touchAction = new TouchAction(driver).press(startX, startY).moveTo(endX, endY).release();
		driver.performTouchAction(touchAction);
	}

	public WebDriverWait getWait() {
		return wait;
	}
}