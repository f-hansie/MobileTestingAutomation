package AppiumAutomationTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.Assert;

public class UniversalMusicPlayerTest {


    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        dc.setCapability("platformName","Android");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),dc);

        //navigate to genre tab and click it
        MobileElement el1 = (MobileElement) ad.findElementById("com.instantappsample.uamp:id/title");
        el1.click();

        //navigate to genre list and select Rock music list
        MobileElement el2 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
        el2.click();

        //navigate to song list and select the first song from list
        MobileElement el3 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
        el3.click();

        //wait method
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //navigate to play or pause button and press Pause to stop the music
        MobileElement el4 = (MobileElement) ad.findElementByAccessibilityId("play or pause");
        el4.click();

        // assertion to an element => c
        Assert.assertEquals(ad.findElementByXPath("//android.widget.TextView[@content-desc=\"Song currently playing\"]").getText(),"Wish You'd Come True");

    }
}
