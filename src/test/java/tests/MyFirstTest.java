
package tests;

import activities.Home2Activity;
import activities.HomeActivity;
import activities.LegalActivity;
import activities.StartActivity;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesPASSTest() throws InterruptedException {
    	String message ="Hola mundo con Appium #Globant #TAE #Test";
    	StartActivity startActivity = new StartActivity(driver);
        startActivity
                .clickLogin()
                .fillData("evozur_92@hotmail.com", "pitufo12")
                .autorizar().twiitear("Este es el msg");
        Thread.sleep(4000);
    }

}