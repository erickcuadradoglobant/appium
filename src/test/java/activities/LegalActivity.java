package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LegalActivity extends BaseActivity {

    @AndroidFindBy(className = "android.webkit.WebView")
    private AndroidElement legalNotices;

    public LegalActivity(AppiumDriver driver) {
        super(driver);
    }

    public LegalActivity swipeDown() {
//        swipe(400, 450, 0, -40);
        return this;
    }

    public String getLegalNotices() {
        return legalNotices.getText();
    }

}
