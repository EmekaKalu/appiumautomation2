package org.gstore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class dcap {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "42005fc5c62716ed");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\KALU\\Documents\\AppiumAutomation\\My Projects\\GeneralStore\\src\\General-Store.apk");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        return driver;
    }
}
