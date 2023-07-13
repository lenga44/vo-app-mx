package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import platform.Platform;

public class DriverFactory implements MobileCapabilityTypeEx {
    public static AppiumDriver<MobileElement> getDriver(Platform platform){
        AppiumDriver<MobileElement> appiumDriver = null;
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "android");
        desiredCapabilities.setCapability(AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(UDID, "emulator-5554");
        desiredCapabilities.setCapability(APP_PACKAGE, "com.earlystart.android.monkeyjunior");
        desiredCapabilities.setCapability(APP_ACTIVITY, "com.earlystart.android.monkeyjunior.MainActivity");

        URL appiumServer = null;
        try {
            appiumServer = new URL("http://localhost:4723/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(appiumServer == null)
            throw new RuntimeException("Can't construc the appium server url @http://localhost:4723/");

        switch (platform){
            case ANDROID:
                appiumDriver = new AndroidDriver<>(appiumServer,desiredCapabilities);
                break;
            case IOS:
                appiumDriver = new IOSDriver<>(appiumServer,desiredCapabilities);
        }
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return appiumDriver;
    }
}
