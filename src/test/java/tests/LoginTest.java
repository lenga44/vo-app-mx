package tests;

import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.*;
import platform.Platform;
import testflows.LoginFlow;

public class LoginTest {
    private AppiumDriver<MobileElement> appiumDriver;
    private LoginFlow loginFlow;

    @BeforeClass
    public void beforeMethod(){
         appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
    }
    @Test
    public void TC01_loginCred(){
        loginFlow = new LoginFlow(appiumDriver,"0378354093","12345678");
        loginFlow.goToLoginScreen();
        loginFlow.login();
    }

    @AfterClass
    public void afterMethod(){
        appiumDriver.quit();
    }
}
